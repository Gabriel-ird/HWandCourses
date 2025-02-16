import java.util.Scanner;

public class convertor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Celsius value to convert in Fahrenheit:");
        int n = scan.nextInt();

        double c = (int) (n * 1.8 + 32);
            System.out.println(n + " degree Celsius = " + c + " degree Fahrenheit");


        }
    }
