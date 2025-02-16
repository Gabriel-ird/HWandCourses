import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        boolean divisible2 = ( number % 2 == 0);
        boolean divisible3 = ( number % 3 == 0);

        if (divisible2 && divisible3) {
            System.out.println("number " + number +" is divisible by both 2 and 3");
        }
        else if (divisible2) {
            System.out.println("number " + number +" is divisible by 2 and not by 3");
        }
        else if (divisible3) {
            System.out.println("number " + number + " is divisible by 3 and not by 2");
        }
        else {
            System.out.println("number" + number + "is not divisible by either 2 or 3");
        }


    }
}
