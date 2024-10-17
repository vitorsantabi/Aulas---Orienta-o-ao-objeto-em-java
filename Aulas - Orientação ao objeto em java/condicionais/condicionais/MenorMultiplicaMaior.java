import java.util.Scanner;

public class MenorMultiplicaMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[3];
// laço
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite um valor maior que zero: ");
            numeros[i] = scanner.nextInt();

  //verifica se o numero é igual a 0
            if (numeros[i] <= 0) {
                System.out.println("Valor inválido. Digite novamente.");
                i--;
            }
        }

        int menor = Math.min(numeros[0], Math.min(numeros[1], numeros[2]));
        int maior = Math.max(numeros[0], Math.max(numeros[1], numeros[2]));

        System.out.println("Menor * Maior = " + (menor * maior));
        System.out.println("Maior / Menor = " + (maior / menor));
    }
}
