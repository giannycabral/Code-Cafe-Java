import java.util.Scanner;
public class ConcatenarPalavras {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite a primeira palavra: ");
            String palavra1 = scanner.nextLine();
            
            System.out.println("Digite a segunda palavra: ");
            String palavra2 = scanner.nextLine();
            
            String concatenacao = palavra1 + " " + palavra2;
            
            System.out.println("A concatenação das palavras é: " + concatenacao);
        }
    }
}