package br.com.alura.lista4;

public class Livro implements Calculavel{
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return (30*getPreco()) / 100;
    }
}
