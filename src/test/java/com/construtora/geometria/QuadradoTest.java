package com.construtora.geometria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuadradoTest {

    @Test
    void deveCalcularAreaDoQuadrado() {
        Quadrado quadrado = new Quadrado(4);

        assertEquals(16, quadrado.calcularArea());
        assertEquals("Quadrado", quadrado.getNome());
    }

    @Test
    void deveRejeitarLadoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Quadrado(0));
        assertThrows(IllegalArgumentException.class, () -> new Quadrado(-2));
    }
}
