import java.util.Scanner;

public class compare {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first number you want to compare:");
        int n = scan.nextInt();

        System.out.println("Type the second number you want to compare with:");
        int n2 = scan.nextInt();

        if (n > n2) {
            System.out.println(n + " is greater than " + n2);
        } else if (n < n2) {
            System.out.println(n + " is less than " + n2);
        } else {
            System.out.println(n + " is equal to " + n2);


        }
    }

}
