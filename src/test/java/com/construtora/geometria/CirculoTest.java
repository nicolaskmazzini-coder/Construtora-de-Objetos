package com.construtora.geometria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CirculoTest {

    @Test
    void deveCalcularAreaDoCirculo() {
        Circulo circulo = new Circulo(2);

        assertEquals(Math.PI * 4, circulo.calcularArea(), 0.0001);
        assertEquals("Círculo", circulo.getNome());
    }

    @Test
    void deveRejeitarRaioInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Circulo(0));
        assertThrows(IllegalArgumentException.class, () -> new Circulo(-3));
    }
}
