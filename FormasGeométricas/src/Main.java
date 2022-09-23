import java.util.Scanner;

import formas.Circulo;
import formas.Losango;
import formas.Quadrado;
import formas.Retangulo;
import formas.Triangulo;

public class Main {
    public static void main(String[] args) {
        int opcao,opcaoDoWhile = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Escolha a forma geométrica:");
            System.out.println("1 - Círculo");
            System.out.println("2 - Triângulo");
            System.out.println("3 - Quadrilátero");
            opcao = in.nextInt();
            switch(opcao) {
                case 1:
                    System.out.println("Informe o raio:");
                    double raio = in.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área do Círculo: " + circulo.calcularArea());
                    break;
                case 2:
                    System.out.println("Informe a base:");
                    double base = in.nextDouble();
                    System.out.println("Informe a altura:");
                    double altura = in.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);
                    System.out.println("Área do Triângulo: " + triangulo.calcularArea());
                    break;
                case 3:
                    System.out.println("Informe o tipo de Quadrilátero: ");
                    System.out.println("1 - Quadrado ");
                    System.out.println("2 - Retângulo ");
                    System.out.println("3 - Losango ");
                    int opcaoQuadrilatero = in.nextInt();
                    menuQuadrilatero(opcaoQuadrilatero);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Gostaria de calcular uma nova área?");
            System.out.println("1 - Sim");
            System.out.println("Qualquer Valor - Não");
            opcaoDoWhile = in.nextInt();
            opcao = 0;
        }while(opcaoDoWhile == 1);
    }
    public static void menuQuadrilatero(int opcaoQuadrilatero){
        Scanner in = new Scanner(System.in);
        switch(opcaoQuadrilatero){
            case 1:
                System.out.println("Informe o lado do quadrado:");
                double lado = in.nextDouble();
                Quadrado quadrado = new Quadrado(lado);
                System.out.println("A área do quadrado é " + quadrado.calcularArea());
                break;
            case 2:
                System.out.println("Informe a base do retangulo:");
                double base = in.nextDouble();
                System.out.println("Informe a altura do retangulo:");
                double altura = in.nextDouble();
                Retangulo retangulo = new Retangulo(base, altura);
                System.out.println("A área do retangulo é " + retangulo.calcularArea());
                break;
            case 3:
                System.out.println("Informa a diagonal maior:");
                double diagonalMaior = in.nextDouble();
                System.out.println("Informe a diagonal menor:");
                double diagonalMenor = in.nextDouble();
                Losango losango = new Losango(diagonalMenor, diagonalMaior);
                System.out.println("A área do losango é " + losango.calcularArea());
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }
}
