import java.util.Scanner;
import java.awt.Frame;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double num1, num2;

            System.out.println("Enter Numbers: ");

            num1 = scanner.nextDouble();
            num2 = scanner.nextDouble();

            System.out.println("Enter Operator: ");
            char operator = scanner.next().charAt(0);

            double result = 0;
            switch (operator) {
                case '*':
                    result = num1 * num2;
                    break;
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("Press Enter to restart...");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}
