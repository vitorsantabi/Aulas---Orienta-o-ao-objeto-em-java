import java.util.Scanner;  // Importa a classe Scanner para leitura de dados do teclado

public class ModuloNumero {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();  // Lê o número inteiro inserido pelo usuário

        // Calcula o módulo (valor absoluto) do número inserido
        // Usa uma operação ternária: se o número for menor que 0, multiplica por -1, senão mantém o valor
        int modulo = (numero < 0) ? numero * -1 : numero;

        // Exibe o valor do módulo (absoluto) na tela
        System.out.println("O módulo do número é: " + modulo);

        // Fecha o objeto Scanner para liberar os recursos
        scanner.close();
    }
}
