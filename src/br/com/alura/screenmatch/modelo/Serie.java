package br.com.alura.screenmatch.modelo;

public class Serie extends Titulo{

    private int temporadas;
    private int episodios;
    private boolean ativa;
    private double duracaoEpisodio;

    public double getDuracaoEpisodio() {
        return duracaoEpisodio;
    }

    public void setDuracaoEpisodio(double duracaoEpisodio) {
        this.duracaoEpisodio = duracaoEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public double getDuracao() {
        return temporadas * episodios * duracaoEpisodio;
    }
}
