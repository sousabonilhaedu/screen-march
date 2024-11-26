public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.nome = "Dune";
        filme.lancamento = 2020;
        filme.avaliaFilme(8);
        filme.avaliaFilme(5);
        filme.avaliaFilme(9.5);

        filme.mostraFicha();
        System.out.println(filme.fazMedia());
    }
}
