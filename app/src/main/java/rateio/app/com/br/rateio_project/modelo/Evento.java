package rateio.app.com.br.rateio_project.modelo;

import java.util.List;

/**
 * Created by felipe on 29/09/2015.
 */
public class Evento {
    private int id;
    private String nome;
    private List<Pessoa> participantes;
    private List<Tag> tags;

    public Evento(int id, String nome, List<Tag> tags, List<Pessoa> participantes) {
        this.id = id;
        this.nome = nome;
        this.tags = tags;
        this.participantes = participantes;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarParticipante(Pessoa pessoa){
        participantes.add(pessoa);
    }

    public void removerParticipante(Pessoa pessoa){
        participantes.remove(pessoa);
    }

    /*
            Caso metodo precoPorParticipante retorne um valor:
             - positivo: a pessoa em questão ira receber aquele valor
             - negativo: a pessoa em questão ira pagar aquele valor
         */
    public double precoPorParticipante(Pessoa pessoa){
        double precoAReceber = 0.0;
        double precoAPagar = 0.0;

        if(participantes.contains(pessoa)) {
            for (Tag tag : tags) {
                precoAPagar += tag.precoASerPago(pessoa);

                if (tag.getPagador().equals(pessoa))
                    precoAReceber += tag.getPreco();
            }

            return (precoAReceber - precoAPagar);
        }else return 0.0; //ToDo: Colocar Exception
    }
}

