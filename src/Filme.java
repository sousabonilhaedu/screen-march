public class Filme {
    String nome;
    int lancamento;
    double duracao;
    double totalAvaliacao;
    double somaAvaliacao;

    void mostraFicha(){
        System.out.println("nome do filme: " + nome);
        System.out.println("data de lançamento: " + lancamento);
        System.out.println("duração: " + duracao + "min");
    }

    void avaliaFilme(double nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    double fazMedia(){
        return somaAvaliacao / totalAvaliacao;
    }

}
