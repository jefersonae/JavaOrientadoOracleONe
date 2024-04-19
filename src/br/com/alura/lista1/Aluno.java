package br.com.alura.lista1;

public class Aluno {
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

    public void exibeFicha(){
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Aluno: "+getNome());
        System.out.println("Idade: "+getIdade());
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
}
