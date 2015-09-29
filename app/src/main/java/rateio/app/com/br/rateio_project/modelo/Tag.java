package rateio.app.com.br.rateio_project.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by felipe on 29/09/2015.
 */
public class Tag {
    private int id;
    private String nome;
    private double preco;
    private List<Pessoa> consumidores;
    private Pessoa pagador;

    public Tag(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.consumidores = new ArrayList<Pessoa>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Pessoa getPagador() {
        return pagador;
    }

    public void adicionarConsumidor(Pessoa pessoa){
        consumidores.add(pessoa);
    }

    public void removerConsumidor(Pessoa pessoa){
        consumidores.remove(pessoa);
    }

    public double precoASerPago(Pessoa pessoa){
        if(consumidores.contains(pessoa)){
            return preco/consumidores.size();
        }else return 0.0; //ToDo: Colocar Exception
    }
}
