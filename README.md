# A Construtora de Objetos

[![Java](https://img.shields.io/badge/Java-17-orange?style=flat&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Maven](https://img.shields.io/badge/Maven-3.8+-blue?style=flat&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5-green?style=flat&logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Calculadora geométrica em Java que demonstra **Programação Orientada a Objetos (POO)** na prática. O projeto constrói objetos (`Quadrado`, `Retângulo`, `Círculo`) a partir de entradas do usuário e calcula suas áreas usando polimorfismo.

## Demonstração

```
--- Java Constructions Inc. ---
1. Calcular Área do Quadrado
2. Calcular Área do Retângulo
3. Calcular Área do Círculo
4. Sair
Escolha uma opção: 1
Digite o valor do lado: 4
Área do Quadrado: 16.00
```

## Conceitos aplicados

| Conceito | Onde aparece no projeto |
|----------|-------------------------|
| **Encapsulamento** | Atributos privados com validação nos construtores |
| **Abstração** | Interface `Forma` define o contrato comum |
| **Polimorfismo** | `CalculadoraGeometrica` trata todas as formas via `Forma` |
| **Construtores** | Cada classe de forma exige parâmetros válidos na criação |
| **Validação de entrada** | Tratamento de dados inválidos no console |

## Estrutura do projeto

```
src/
├── main/java/com/construtora/
│   ├── Main.java
│   └── geometria/
│       ├── Forma.java
│       ├── Quadrado.java
│       ├── Retangulo.java
│       ├── Circulo.java
│       └── CalculadoraGeometrica.java
└── test/java/com/construtora/geometria/
    ├── QuadradoTest.java
    ├── RetanguloTest.java
    └── CirculoTest.java
```

## Pré-requisitos

- Java 17 ou superior
- Maven 3.8+

## Como executar

```bash
# Clonar o repositório
git clone https://github.com/nicolaskmazzini-coder/construtora-de-objetos.git
cd construtora-de-objetos

# Compilar e rodar
mvn compile exec:java
```

Alternativa com JAR:

```bash
mvn package
java -jar target/construtora-de-objetos-1.0.0.jar
```

## Testes

```bash
mvn test
```

## Tecnologias

- **Java 17** — linguagem principal
- **Maven** — gerenciamento de dependências e build
- **JUnit 5** — testes unitários

## Sobre

Projeto acadêmico focado em consolidar fundamentos de POO em Java. Ideal para portfólio de quem está iniciando na área de desenvolvimento backend.

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
