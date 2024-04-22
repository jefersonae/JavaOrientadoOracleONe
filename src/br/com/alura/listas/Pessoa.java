package br.com.alura.listas;

public class Pessoa {
    private String nome;
    private byte idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        return "Pessoa: " +this.getNome() + " Idade: " +this.getIdade();
    }
}