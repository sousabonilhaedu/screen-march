package Principais;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainLists {
    public static void main(String[] args) {
        Filme outroFilme = new Filme("Duna", 2022);
        outroFilme.avaliaFilme(9.0);
        Filme filme2 = new Filme("Lord of The Rings", 2001);
        filme2.avaliaFilme(10);
        Serie serie = new Serie("Arcane", 2024);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(serie);
        list.add(outroFilme);
        list.add(filme2);

        for (Titulo item: list){
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Avaliado com: " + filme.getClassificacao() + " estrelas.");
            }
        }

        Collections.sort(list);
        System.out.println(list);

    }
}
