package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int lancamento) {
        super(nome, lancamento);
    }


    @Override
    public int getClassificacao() {
        return (int )fazMedia() / 2;
    }

    @Override
    public String toString() {
        return this.getNome() + " (" + this.getLancamento() + ")";
    }
}
