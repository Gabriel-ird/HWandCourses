import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age:");
        int a = scan.nextInt();


        if (a >= 18) {
            System.out.println("Access granted");

        } else {
            System.out.println("Access denied");


        }

    }
}
