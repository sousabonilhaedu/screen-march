package br.com.alura.screenmatch.modelo;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int lancamento;
    private double duracao;
    private double totalAvaliacao;
    private double somaAvaliacao;

    public Titulo(String nome, int lancamento){
        this.nome = nome;
        this.lancamento = lancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void mostraFicha(){
        System.out.println("nome do filme: " + nome);
        System.out.println("data de lançamento: " + lancamento);
        System.out.println("duração: " + duracao + "min");
    }

    public void avaliaFilme(double nota){
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    public double fazMedia(){
        return somaAvaliacao / totalAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
