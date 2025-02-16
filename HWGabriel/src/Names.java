import java.util.Scanner;

public class Names {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Enter 5 names:");


        System.out.println("1:");

        names[0] = scan.nextLine();

        System.out.println("2:");

        names[1] = scan.nextLine();

        System.out.println("3:");

        names[2] = scan.nextLine();

        System.out.println("4:");

        names[3] = scan.nextLine();

        System.out.println("5:");

        names[4] = scan.nextLine();

        System.out.println("Names in reverse order:");
        for (int x = names.length - 1; x >= 0; x--) {
            System.out.println(names[x]);

        }


    }

}