package br.com.alura.lista4;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valorDolar) {
        return valorDolar*5;
    }
}