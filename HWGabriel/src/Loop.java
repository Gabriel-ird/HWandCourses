import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int n = 0;

        while (n <= a) {
            System.out.println("n = " + n);
            n++;
        }


    }
}
