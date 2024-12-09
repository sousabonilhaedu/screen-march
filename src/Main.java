import br.com.alura.screenmatch.modelo.Filme;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.setNome("Dune");
        filme.setLancamento(2022);

        filme.avaliaFilme(8);
        filme.avaliaFilme(5);
        filme.avaliaFilme(9.5);

        filme.mostraFicha();
        System.out.println(filme.fazMedia());
    }
}
