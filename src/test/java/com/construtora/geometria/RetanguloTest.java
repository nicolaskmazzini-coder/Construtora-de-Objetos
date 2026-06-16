package com.construtora.geometria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RetanguloTest {

    @Test
    void deveCalcularAreaDoRetangulo() {
        Retangulo retangulo = new Retangulo(5, 3);

        assertEquals(15, retangulo.calcularArea());
        assertEquals("Retângulo", retangulo.getNome());
    }

    @Test
    void deveRejeitarDimensoesInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(0, 5));
        assertThrows(IllegalArgumentException.class, () -> new Retangulo(5, -1));
    }
}
