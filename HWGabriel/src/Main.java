import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("number " + number + " is negative.");
        } else {
            System.out.println( "your number is " + number);
        }



    }
}