import java.util.Scanner;  // Importa a classe Scanner, que permite ler dados do teclado

public class DiferencaMaiorMenor {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número e armazena na variável 'num1'
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();  // Lê o primeiro número inteiro

        // Solicita ao usuário que insira o segundo número e armazena na variável 'num2'
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();  // Lê o segundo número inteiro

        // Calcula a diferença absoluta entre os dois números usando o método Math.abs()
        // A função Math.abs() retorna o valor absoluto da diferença (sem sinal negativo)
        int diferenca = Math.abs(num1 - num2);

        // Exibe a diferença entre os dois números na tela
        System.out.println("A diferença do maior para o menor é: " + diferenca);

        // Fecha o objeto Scanner (boa prática para liberar recursos)
        scanner.close();
    }
}
