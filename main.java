import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            double num1, num2;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter First Number: ");
            num1 = scanner.nextDouble();

            System.out.println("Enter Second Number: ");
            num2 = scanner.nextDouble();

            System.out.println("Enter Operator: ");
            char operator = scanner.next().charAt(0);
            if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
                System.out.println("Invalid Operator!");
                continue;
            }

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
                case '/':
                    if(num2 == 0) {
                        System.out.println("NO DIVISION BY ZERO");
                        continue;
                    }
                    result = num1 / num2;
                    break;

            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

            System.out.println("Press Enter to restart...");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}
