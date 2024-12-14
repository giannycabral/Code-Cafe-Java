/*Calcule e exiba o perimetro de um circulo, solicitando o raio ao usuario */

import java.util.Scanner;

public class CalculadoraPerimetroCirculo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o raio do circulo: ");
            double raio = scanner.nextDouble();
            
            double perimetro = 2 * Math.PI * raio;
            
            System.out.println("O perimetro do circulo é: " + perimetro);
        }
    }
}