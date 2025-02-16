import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius to calculare area and circumference of the circle:");
        int r = scan.nextInt(); // r = radius of circle


        System.out.println("Area of the circle is " + (Math.PI * (r*r)));
        System.out.println("Circumference of the circle is " + 2 * Math.PI * r);




    }
}