import java.util.Scanner;  // Importa a classe Scanner, que permite ler dados de entrada do usuário

public class MaiorMenorNumero {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário via teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número e armazena o valor na variável 'num1'
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();  // Lê o primeiro número inteiro

        // Solicita ao usuário que insira o segundo número e armazena o valor na variável 'num2'
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();  // Lê o segundo número inteiro

        // Verifica qual número é maior ou se ambos são iguais
        // Se 'num1' for maior que 'num2', exibe 'num1' como o maior e 'num2' como o menor
        if (num1 > num2) {
            System.out.println("Maior: " + num1 + ", Menor: " + num2);
        }
        // Se 'num2' for maior que 'num1', exibe 'num2' como o maior e 'num1' como o menor
        else if (num2 > num1) {
            System.out.println("Maior: " + num2 + ", Menor: " + num1);
        }
        // Caso contrário, se 'num1' e 'num2' forem iguais, exibe uma mensagem informando isso
        else {
            System.out.println("Os números são iguais.");
        }

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
