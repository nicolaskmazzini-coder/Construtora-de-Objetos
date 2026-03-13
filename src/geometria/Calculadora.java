package geometria;

import java.util.Scanner;

public class Calculadora {

    private double lado;
    private double base;
    private double altura;
    private double raio;
    private int opcao;


    public void menu() {
        System.out.println("--- Java Constructions Inc. ---");
        System.out.println("1.  Calcular Área do Quadrado");
        System.out.println("2.  Calcular Área do Retângulo");
        System.out.println("3.  Calcular Área do Círculo");
        System.out.println("4.  Sair");
        System.out.print("Escolha uma opção: ");
    }


    public void executar() {
        Scanner leitor = new Scanner(System.in);
        this.opcao = leitor.nextInt();

        switch (this.opcao) {
            case 1:
                System.out.print("Digite o valor do lado: ");
                this.lado = leitor.nextDouble();
                double areaQuadrado = this.lado * this.lado;
                System.out.printf("Área do Quadrado: %.2f%n", areaQuadrado);
                break;

            case 2:
                System.out.print("Digite a base: ");
                this.base = leitor.nextDouble();
                System.out.print("Digite a altura: ");
                this.altura = leitor.nextDouble();
                double areaRetangulo = this.base * this.altura;
                System.out.printf("Área do Retângulo: %.2f%n", areaRetangulo);
                break;

            case 3:
                System.out.print("Digite o raio: ");
                this.raio = leitor.nextDouble();
                double areaCirculo = 3.14 * (this.raio * this.raio);
                System.out.printf("Área do Círculo: %.2f%n", areaCirculo);
                break;

            case 4:
                System.out.println("Encerrando sistema...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        leitor.close();
    }
}