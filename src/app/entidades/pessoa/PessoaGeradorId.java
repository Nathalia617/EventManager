package app.entidades.pessoa;

public class PessoaGeradorId {

    private static int id = -1;

    // Manda o id para a classe pessoa
    public static int getId() {
        addId();
        return id;
    }

    // Adiciona +1 no ID
    private static void addId() {
        id++;
    }
}
