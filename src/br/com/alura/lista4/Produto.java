package br.com.alura.lista4;

public class Produto implements Vendavel{
    @Override
    public double aplicaDesconto(double valorProduto, int quantidade) {
        if(quantidade > 1000){
            return (20*valorProduto) / 100;
        }else {
            return (10*valorProduto) / 100;
        }
    }
}
