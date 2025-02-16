
import java.util.Scanner;

public class operation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Choose an operator (+, -, /, *)");

        char op = scanner.next().charAt(0);

        int result = 0;
        boolean invalid = true;

        switch (op) {

                case '+' -> result = number1 + number2;
                case '-' -> result = number1 - number2;
                case '/' -> result = number1 / number2;
                case '*' -> result = number1 * number2;
                default -> {
                    System.out.println("Invalid operator");
                    invalid = false;




            }
        };
        if (invalid) {
            System.out.println("Result: " + result);
        }
    }
}