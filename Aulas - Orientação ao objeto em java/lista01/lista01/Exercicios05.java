package lista01;

import java.util.Scanner;

public class Exercicios05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;
        double litrosUsados = distancia / 12;

        System.out.println("Velocidade média: " + velocidade + " km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Quantidade de litros utilizada: " + litrosUsados + " litros");
    }
}
