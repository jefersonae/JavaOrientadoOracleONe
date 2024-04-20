package br.com.alura.lista4;

public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i < 11; i++) {
            System.out.print(" "+getNumero()*i+" ");
        }
    }
}