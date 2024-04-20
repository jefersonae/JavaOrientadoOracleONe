package br.com.alura.lista3;

public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal(double valorTarifa){
        if (getValor() < valorTarifa){
            System.out.println("Valor indisponivel");
        }else {
            valorTarifa = getValor() - valorTarifa;
            setValor(valorTarifa);
        }
    }
}
