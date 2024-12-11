import br.com.alura.screenmatch.calculo.CalculaTempoTotal;
import br.com.alura.screenmatch.calculo.Recomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;


public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Dune");
        filme.setLancamento(2022);
        filme.setDuracao(140);

        Filme filme2 = new Filme();

        filme2.setNome("Lord of The Rings");
        filme2.setLancamento(2001);
        filme2.setDuracao(200);

        filme2.avaliaFilme(5.8);
        filme2.avaliaFilme(9.9);
        filme2.avaliaFilme(9.7);

        Serie serie = new Serie();
        serie.setNome("Arcane");
        serie.setLancamento(2021);
        serie.setDuracaoEpisodio(50);
        serie.setEpisodios(9);
        serie.setTemporadas(2);

        CalculaTempoTotal calcula = new CalculaTempoTotal();

        calcula.inclui(filme);
        calcula.inclui(filme2);
        calcula.inclui(serie);

        Episodio episodio = new Episodio();
        episodio.setSerie(serie);
        episodio.setTotalViews(200);
        episodio.setNumero(1);

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(filme2);


        System.out.println(calcula.getTempoTotalFilmes());
        System.out.println(filme2.fazMedia());
    }
}
