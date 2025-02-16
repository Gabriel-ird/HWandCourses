import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int n = scanner.nextInt();
        int fact = 1;
        int i = n;

        if (n < 0) {
            System.out.println("Negative number");
        } else {

            while (i > 0) {
                fact *= i;
                i--;
            }
            System.out.println(n + "! = " + fact);


        }
    }
}