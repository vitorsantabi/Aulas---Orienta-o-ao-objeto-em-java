import java.util.Scanner;  // Importa a classe Scanner para permitir a leitura de entradas do teclado

public class TrocaValores {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o valor da variável A
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();  // Lê o valor digitado e armazena na variável A

        // Solicita ao usuário que insira o valor da variável B
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();  // Lê o valor digitado e armazena na variável B

        // Realizando a troca de valores entre A e B
        int temp = A;  // Armazena o valor de A em uma variável temporária
        A = B;  // A recebe o valor de B
        B = temp;  // B recebe o valor da variável temporária (o valor original de A)

        // Exibe o resultado da troca
        System.out.println("Após a troca: A = " + A + ", B = " + B);

        // Fecha o objeto Scanner para liberar os recursos
        scanner.close();
    }
}
