package br.com.alura.lista4;

public class Servico implements Vendavel{
    @Override
    public double aplicaDesconto(double valorProduto, int quantidade) {
        if(quantidade > 5){
            return (15*valorProduto) / 100;
        }else {
            return (5*valorProduto) / 100;
        }
    }
}
