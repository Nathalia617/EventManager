package app.entidades.pessoa;

public class PessoaGeradorId {

    private static int id = -1;

    public static int getId() {
        addId();
        return id;
    }

    private static void addId() {
        id++;
    }
}
