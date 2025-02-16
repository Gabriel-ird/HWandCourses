import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Multiplication table of a number");

        System.out.println("Type a number:");
        int nr = scan.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(nr + " * " + i + " = " + (nr * i));




        }
    }
}