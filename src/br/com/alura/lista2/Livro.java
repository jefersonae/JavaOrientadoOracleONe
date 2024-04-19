package br.com.alura.lista2;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
