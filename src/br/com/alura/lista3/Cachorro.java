package br.com.alura.lista3;

public class Cachorro extends Animal{
    public void abanarRabo(){
        System.out.println("Abanando o rabo..");
    }
    @Override
    public void emitirSom() {
        System.out.println("Latido...");
        System.out.println("Au au au au");
    }
}