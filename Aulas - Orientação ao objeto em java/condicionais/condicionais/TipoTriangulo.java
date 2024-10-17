import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor do lado B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor do lado C: ");
        int C = scanner.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("Triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("Triângulo isósceles.");
            } else {
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}
