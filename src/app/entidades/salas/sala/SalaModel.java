package app.entidades.salas.sala;
import app.entidades.pessoa.PessoaModel;

public abstract class SalaModel {

    private int id;
    private String nome;

    // Metodo construtor
    public SalaModel(String nome) {
        this.setId(SalaGeradorId.getId());
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract PessoaModel getPessoa(String nome);

    public void addPessoa(PessoaModel p, int i) {
    }
}

