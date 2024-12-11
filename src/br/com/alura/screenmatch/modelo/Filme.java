package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    @Override
    public int getClassificacao() {
        return (int )fazMedia() / 2;
    }
}
