package br.com.alura.lista4;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return getAltura()*getLargura();
    }

    @Override
    public double calcularPerimetro() {
        return 2*(getLargura()+getLargura());
    }
}