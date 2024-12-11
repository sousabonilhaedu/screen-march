package br.com.alura.screenmatch.calculo;

public class Recomendacao {
    public void filtra(Classificavel classificacao){
        if(classificacao.getClassificacao() >= 4){
            System.out.println("Esse filme está entre os mais bem avaliados!");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Esse filme é muito bem avaliado!");
        } else {
            System.out.println("Assista mais tarde.");
        }
    }
}
