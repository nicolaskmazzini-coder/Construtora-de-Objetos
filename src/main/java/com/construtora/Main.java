package com.construtora;

import com.construtora.geometria.CalculadoraGeometrica;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        CalculadoraGeometrica calculadora = new CalculadoraGeometrica(leitor);

        calculadora.executar();

        leitor.close();
    }
}
