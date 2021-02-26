import app.entidades.pessoa.PessoaModel;
import app.entidades.salas.sala.SalaModel;
import app.entidades.salas.salaEvento.SalaEventoModel;

public class Main {

    public static void main(String[] args) throws Exception {
        PessoaModel p = new PessoaModel("aaa", "bb");
        PessoaModel p2 = new PessoaModel("a2aa", "bb");
        PessoaModel p3 = new PessoaModel("aa3a", "bb");

        SalaModel s = new SalaEventoModel("aaa", 22);
        SalaModel s2 = new SalaEventoModel("aaaa", 22);
        SalaModel s3 = new SalaEventoModel("aaaa", 22);

        s.addPessoa(p, 1);
        s.addPessoa(p2, 1);
        s.addPessoa(p3, 1);
        System.out.println(s.getPessoa("aaa"));
    }
}
