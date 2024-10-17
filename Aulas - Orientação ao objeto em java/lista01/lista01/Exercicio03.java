package lista01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Identificação do vendedor: ");
        String vendedorId = scanner.next();

        System.out.print("Código da peça: ");
        String codigoPeca = scanner.next();

        System.out.print("Preço unitário da peça: ");
        double precoUnitario = scanner.nextDouble();

        System.out.print("Quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        double totalVenda = precoUnitario * quantidadeVendida;
        double comissao = totalVenda * 0.05;

        System.out.println("A comissão do vendedor é: R$ " + comissao);
    }
}
