package lista01;

import java.util.Scanner;

public class Exercicios06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
