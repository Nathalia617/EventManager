package app.entidades.salas.salaEvento;

import app.constants.Etapa;
import app.entidades.pessoa.PessoaModel;
import app.entidades.salas.sala.SalaModel;

import java.util.ArrayList;
import java.util.HashMap;

public class SalaEventoModel extends SalaModel {

    private HashMap<String, ArrayList<PessoaModel>> etapas = new HashMap<String, ArrayList<PessoaModel>>();
    private int lotacao;

    public SalaEventoModel(String nome, int lotacao) {
        super(nome);
        etapas.put(Etapa.PRIMEIRA, new ArrayList<PessoaModel>());
        etapas.put(Etapa.SEGUNDA, new ArrayList<PessoaModel>());
        this.setLotacao(lotacao);
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public ArrayList<PessoaModel> getPessoas(int etapa) {
        // PASSAR PARA CAMADA CONTROL
        if (etapa == 1) {
            return this.etapas.get(Etapa.PRIMEIRA);
        } else if (etapa == 2) {
            return this.etapas.get(Etapa.SEGUNDA);
        } else {
            return null;
        }
    }

    public void addPessoa(PessoaModel pessoa, int etapa) {
        if (etapa == 1) {
            this.etapas.get(Etapa.PRIMEIRA).add(pessoa);
        } else if (etapa == 2) {
            this.etapas.get(Etapa.SEGUNDA).add(pessoa);
        }
    }

    @Override
    public PessoaModel getPessoa(String nome) {
        for (PessoaModel p: this.etapas.get(Etapa.PRIMEIRA)) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }

        for (PessoaModel p: this.etapas.get(Etapa.SEGUNDA)) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
}