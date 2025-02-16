import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height:");
        int h = scan.nextInt();

        System.out.println("Enter base:");
        int b = scan.nextInt();

        System.out.println("Area of the rectangle is " + (b * h));
        System.out.println("Perimeter of the rectangle is " + 2 * (b + h));
        System.out.println("Area of the triangle is " + (b * h) / 2);


    }
}
