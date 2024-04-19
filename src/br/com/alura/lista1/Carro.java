package br.com.alura.lista1;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    public void fichaTecnica(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

    public int calculoIdade(){
        return 2024 - ano;
    }
}