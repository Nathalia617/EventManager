package app.entidades.salas.salaCafe;

import app.entidades.pessoa.PessoaModel;
import app.entidades.salas.sala.SalaModel;

import java.util.ArrayList;

public class SalaCafeModel extends SalaModel {

    private ArrayList<PessoaModel> pessoas = new ArrayList<>();

    public SalaCafeModel(String nome) {
        super(nome);
    }

    @Override
    public PessoaModel getPessoa(String nome) {
        return null;
    }

    public void addPessoa(PessoaModel pessoa) {
        this.pessoas.add(pessoa);
    }
}
