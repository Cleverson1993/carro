import java.util.Scanner;

public class Cauculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        System.out.println("Digite a operação (+, -, *, /, ):");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 /num2;
                break;
            default:
                System.out.println("Operação invalida.");
                return;
                
        }

        System.out.println(num1+" "+operator+" "+num2+" = "+result);
    }
}
