import java.text.DecimalFormat;
import java.util.Scanner;

public class operatii {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        Scanner scan = new Scanner(System.in);

        System.out.println("select first number:");
        double a = scan.nextInt();

        System.out.println("select second number:");
        double b = scan.nextInt();

        double x = a + b;
        double y = a - b;
        double z = a * b;
        double w = a / b;
        double q = a % b;

        System.out.println("Addition:");
        System.out.println((int)a + " + " + (int)b + " = " + (int)x);

        System.out.println("Multiply:");
        System.out.println((int)a + " * " + (int)b + " = " + (int)z);

        System.out.println("Substract:");
        System.out.println((int)a + " - " + (int)b + " = " + (int)y);

        System.out.println("Divide:");

        String formattedNumber = df.format(w);

        System.out.println((int)a + " / " + (int)b + " = " + (formattedNumber));



        System.out.println("Remainder:");
        System.out.println((int)a + " % " + (int)b + " = " + q);



    }

}
