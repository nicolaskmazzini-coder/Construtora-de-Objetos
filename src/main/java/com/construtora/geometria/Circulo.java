package com.construtora.geometria;

public class Circulo implements Forma {

    private final double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio do círculo deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public String getNome() {
        return "Círculo";
    }
}
