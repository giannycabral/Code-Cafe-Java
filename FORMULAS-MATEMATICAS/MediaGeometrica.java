import java.util.Scanner;

public class MediaGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();

        double mediaGeometrica = Math.pow(num1 * num2 * num3, 1.0 / 3);
        System.out.println("A média geométrica é: " + mediaGeometrica);

        scanner.close();
    }

}
