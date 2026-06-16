package com.construtora.geometria;

import java.util.Scanner;

public class CalculadoraGeometrica {

    private final Scanner leitor;

    public CalculadoraGeometrica(Scanner leitor) {
        this.leitor = leitor;
    }

    public void executar() {
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = lerInteiro("Escolha uma opção: ");

            switch (opcao) {
                case 1 -> calcularQuadrado();
                case 2 -> calcularRetangulo();
                case 3 -> calcularCirculo();
                case 4 -> {
                    System.out.println("Encerrando sistema...");
                    continuar = false;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            if (continuar) {
                System.out.println();
            }
        }
    }

    private void exibirMenu() {
        System.out.println("--- Java Constructions Inc. ---");
        System.out.println("1. Calcular Área do Quadrado");
        System.out.println("2. Calcular Área do Retângulo");
        System.out.println("3. Calcular Área do Círculo");
        System.out.println("4. Sair");
    }

    private void calcularQuadrado() {
        double lado = lerDouble("Digite o valor do lado: ");
        exibirResultado(new Quadrado(lado));
    }

    private void calcularRetangulo() {
        double base = lerDouble("Digite a base: ");
        double altura = lerDouble("Digite a altura: ");
        exibirResultado(new Retangulo(base, altura));
    }

    private void calcularCirculo() {
        double raio = lerDouble("Digite o raio: ");
        exibirResultado(new Circulo(raio));
    }

    private void exibirResultado(Forma forma) {
        System.out.printf("Área do %s: %.2f%n", forma.getNome(), forma.calcularArea());
    }

    private int lerInteiro(String mensagem) {
        System.out.print(mensagem);
        while (!leitor.hasNextInt()) {
            leitor.next();
            System.out.print("Entrada inválida. " + mensagem);
        }
        return leitor.nextInt();
    }

    private double lerDouble(String mensagem) {
        System.out.print(mensagem);
        while (!leitor.hasNextDouble()) {
            leitor.next();
            System.out.print("Entrada inválida. " + mensagem);
        }
        return leitor.nextDouble();
    }
}
