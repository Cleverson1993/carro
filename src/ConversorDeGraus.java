import java.util.Scanner;

public class ConversorDeGraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius :");
        double celsius = scanner.nextDouble();
        scanner.close();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius+" graus é igual a: " + fahrenheit+"graus Fahrenheit.");

    }
}
