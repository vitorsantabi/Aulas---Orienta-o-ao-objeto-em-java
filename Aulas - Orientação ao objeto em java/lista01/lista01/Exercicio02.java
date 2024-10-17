package lista01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacaoDolar;

        System.out.println("O valor em reais é: R$ " + valorReal);
    }
}
