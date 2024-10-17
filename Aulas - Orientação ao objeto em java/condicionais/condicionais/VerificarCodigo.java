import java.util.Scanner;

public class VerificarCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código (1, 2 ou 3): ");
        int codigo = scanner.nextInt();
// printa em tela as opcoes de 1 a 3, quando for deferente ele imprime codigo invalido
        switch (codigo) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            default:
                System.out.println("Código inválido.");
        }
    }
}
