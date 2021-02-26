package app.entidades.pessoa;

public class PessoaModel {

    private int id;
    private String nome;
    private String sobreNome;

    public PessoaModel(String nome, String sobreNome) {
        this.setId(PessoaGeradorId.getId());
        this.setNome(nome);
        this.setSobreNome(sobreNome);
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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
