package com.construtora.geometria;

public class Quadrado implements Forma {

    private final double lado;

    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
        }
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }
}
