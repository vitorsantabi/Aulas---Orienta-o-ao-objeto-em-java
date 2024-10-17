package lista01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima de peças: ");
        double quantidadeMinima = scanner.nextDouble();

        System.out.print("Digite a quantidade máxima de peças: ");
        double quantidadeMaxima = scanner.nextDouble();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.println("O estoque médio é: " + estoqueMedio);
    }
}
