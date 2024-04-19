package br.com.alura.lista2;

public class idadePessoa {
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

    public String verificarIdade(){
        if (getIdade() >= 18){
            return "Menor de idade";
        }else {
            return "Maior de idade";
        }
    }
}
