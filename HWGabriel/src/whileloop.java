import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Enter the number: ");
        int i = scanner.nextInt();

        while (i > 0) {
            sum += i;
            System.out.println("Enter the number: ");
            i = scanner.nextInt();
        }

        System.out.println("The sum of all positive numbers entered is: " + sum);
            }
        }

