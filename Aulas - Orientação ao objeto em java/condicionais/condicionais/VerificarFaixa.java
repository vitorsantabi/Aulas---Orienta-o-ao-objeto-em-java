import java.util.Scanner;

public class VerificarFaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
// condiona numeros entre 0 e 9 , se n for entre esses numero ele print q é invelido
        if (numero >= 0 && numero <= 9) {
            System.out.println("Valor válido.");
        } else {
            System.out.println("Valor inválido.");
        }
    }
}
