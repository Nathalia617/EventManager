package app.entidades.salas.sala;

public class SalaGeradorId{

    private static int id = -1;

    public static int getId() {
        addId();
        return id;
    }

    private static void addId() {
        id++;
    }
}
