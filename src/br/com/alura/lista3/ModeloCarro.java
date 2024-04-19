package br.com.alura.lista3;

public class ModeloCarro extends Carro{
    public void definePrecos(double ano1, double ano2, double ano3){
        setAno1(ano1);
        setAno2(ano2);
        setAno2(ano3);
    }
    public void mostraInformacoes(){
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano 1: R$"+getAno1());
        System.out.println("Ano 2: R$"+getAno2());
        System.out.println("Ano 3: R$"+getAno3());
        System.out.println("+++++++++++++++++++++++++++++++++++");
    }
}