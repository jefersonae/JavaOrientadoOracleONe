package br.com.alura.lista3;

public class ContaBancaria {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void deposita(double dinheiro){
        dinheiro+=getValor();
        setValor(dinheiro);
    }

    public void saca(double dinheiroSacado){
        if (dinheiroSacado > getValor()){
            System.out.println("Erro valor maior do que o que tem em conta");
        }else {
            dinheiroSacado = getValor() - dinheiroSacado;
            setValor(dinheiroSacado);
        }
    }
}