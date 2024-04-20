package br.com.alura.lista3;

public class Gato extends Animal{

    public void arranharMoveis(){
        System.out.println("Arranhando os moveis");
    }
    @Override
    public void emitirSom() {
        System.out.println("Miando.....");
        System.out.println("Miau maiu maiu");
    }
}
