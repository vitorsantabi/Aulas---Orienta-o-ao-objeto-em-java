package lista01;

import java.util.Scanner;

public class Exercicios08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da lata (em cm): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura da lata (em cm): ");
        double altura = scanner.nextDouble();

        double volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata é: " + volume + " cm³");
    }
}
