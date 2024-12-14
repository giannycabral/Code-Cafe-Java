/*Calculo da média de dois numeros, somando-os e dividindo o resultado por 2*/

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double media = (num1 + num2) / 2;
            
            System.out.println("A média dos dois números é: " + media);
        }
    }
}
