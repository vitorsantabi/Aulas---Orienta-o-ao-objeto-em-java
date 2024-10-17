import java.util.Scanner;  // Importa a classe Scanner para leitura de dados do teclado

public class MediaAluno {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Cria um array para armazenar as 4 notas do aluno
        double[] notas = new double[4];
        double soma = 0;  // Variável para somar as notas

        // Laço for que itera 4 vezes para capturar as 4 notas do aluno
        for (int i = 0; i < 4; i++) {
            // Solicita ao usuário para digitar a nota e armazena no array
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();  // Lê a nota inserida
            soma += notas[i];  // Soma a nota ao total
        }

        // Calcula a média das 4 notas
        double media = soma / 4;

        // Condição para verificar se a média é maior ou igual a 7
        if (media >= 7) {
            // Se a média for maior ou igual a 7, o aluno está aprovado
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            // Caso contrário, o aluno precisa fazer recuperação
            System.out.print("Digite a nota da recuperação: ");
            double recuperacao = scanner.nextDouble();  // Lê a nota de recuperação
            // Recalcula a média considerando a nota de recuperação
            media = (media + recuperacao) / 2;

            // Verifica se a nova média é maior ou igual a 7 após a recuperação
            if (media >= 7) {
                // Se for, o aluno está aprovado na recuperação
                System.out.println("Aluno aprovado na recuperação com média: " + media);
            } else {
                // Se a média continuar abaixo de 7, o aluno está reprovado
                System.out.println("Aluno reprovado com média: " + media);
            }
        }

        // Fecha o objeto Scanner para liberar os recursos
        scanner.close();
    }
}
