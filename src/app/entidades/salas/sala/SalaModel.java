package app.entidades.salas.sala;
import app.entidades.pessoa.PessoaModel;

public abstract class SalaModel {

    private int id;
    private String nome;

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
        // PASSAR PARA CAMADA CONTROL
        if (!nome.equals("")) {
            this.nome = nome;
        } else throw new NullPointerException("Nome nulo");
    }

    public abstract PessoaModel getPessoa(String nome);

    public void addPessoa(PessoaModel p, int i) {
    }
}

