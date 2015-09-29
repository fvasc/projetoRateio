package rateio.app.com.br.rateio_project.modelo;

/**
 * Created by felipe on 29/09/2015.
 */
public class Pessoa {
    private int id;
    private String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
