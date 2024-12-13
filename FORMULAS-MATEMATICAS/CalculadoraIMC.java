import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digiteo peso em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("O seu IMC é: " + imc);

        scanner.close();
    }

}
