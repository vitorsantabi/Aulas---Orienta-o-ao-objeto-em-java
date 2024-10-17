package lista01;

import java.util.Scanner;

public class Exercicios04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();

        int[] valores = {A, B, C, D};

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                int soma = valores[i] + valores[j];
                int multiplicacao = valores[i] * valores[j];
                System.out.println("Soma de " + valores[i] + " e " + valores[j] + " = " + soma);
                System.out.println("Multiplicação de " + valores[i] + " e " + valores[j] + " = " + multiplicacao);
            }
        }
    }
}
