package br.com.alura.lista3;

public class Carro {
    private String modelo;
    private double ano1;
    private double ano2;
    private double ano3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAno1() {
        return ano1;
    }

    public void setAno1(double ano1) {
        this.ano1 = ano1;
    }

    public double getAno2() {
        return ano2;
    }

    public void setAno2(double ano2) {
        this.ano2 = ano2;
    }

    public double getAno3() {
        return ano3;
    }

    public void setAno3(double ano3) {
        this.ano3 = ano3;
    }

    public void exibeMaiorMenor(){
        if(ano1 > ano2){
            if(ano1 > ano3){
                System.out.println("O ano 1 é o maior com valor de R$"+ano1);
            }else {
                System.out.println("O ano 3 é o maior com valor de R$"+ano3);
            }
            System.out.println("O ano 2 é o menor com valor de R$"+ano2);
        }else{
            if (ano2 > ano3){
                System.out.println("O ano 2 é o maior com valor de R$"+ano2);
            }
            if (ano1 < ano3){
                System.out.println("O ano 1 é o menor com valor de R$"+ano1);
            }else {
                System.out.println("O ano 3 é o menor com valor de R$"+ano3);
            }
        }
    }
}