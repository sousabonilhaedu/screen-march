package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelo.Titulo;

public class CalculaTempoTotal {
    private int tempoTotalFilmes;

    public int getTempoTotalFilmes() {
        return tempoTotalFilmes;
    }

    public void inclui(Titulo titulo){
        tempoTotalFilmes += titulo.getDuracao();
    }
}
