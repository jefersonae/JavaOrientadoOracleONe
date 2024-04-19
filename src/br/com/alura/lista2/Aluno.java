package br.com.alura.lista2;

public class Aluno {
    private String nome;
    private double nota;
    private int numeroProvas;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaNota(double nota){
        setNota(getNota()+nota);
        numeroProvas++;
    }

    public double calcularMedia(){
        return nota / numeroProvas;
    }
}