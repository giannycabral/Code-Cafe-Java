/*Calculo da média de 4 notas, somando-as e dividindo o resultado por 4. Armazenando o valor na váriavel media.*/

import java.util.Scanner;

public class MediaAritmeticaNotas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            
            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();
            
            System.out.print("Digite a quarta nota: ");
            double nota4 = scanner.nextDouble();
            
            double mediaAritmetica = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média aritmética é: " + mediaAritmetica);
        }
    }
              
}
    