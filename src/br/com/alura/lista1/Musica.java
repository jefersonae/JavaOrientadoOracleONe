package br.com.alura.lista1;

import java.util.Scanner;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private int avaliacao;
    private int numAvaliacoes;

    public void exibeFicha(){
        System.out.println("+++++++++++++++");
        System.out.println("Titulo da música: "+titulo);
        System.out.println("Nome do artista: "+artista);
        System.out.println("+++++++++++++++");
    }

    public void avalia(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a nota para a musica?");
        avaliacao += ler.nextInt();
        numAvaliacoes++;
    }

    public byte mediaAvaliacao(){
        return (byte) (avaliacao / numAvaliacoes);
    }
}
