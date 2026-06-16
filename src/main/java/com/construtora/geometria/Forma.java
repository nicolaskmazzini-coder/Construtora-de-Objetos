package com.construtora.geometria;

/**
 * Contrato comum para todas as formas geométricas suportadas pela aplicação.
 */
public interface Forma {

    double calcularArea();

    String getNome();
}
