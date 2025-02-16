import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        char chr = enterCh();
        consOrVow(chr);
        reverse();

        }

        public static char enterCh () {

            System.out.println("Enter a character: ");
            Scanner scan = new Scanner(System.in);
            return scan.next().charAt(0);

        }

        public static void consOrVow ( char chr){
            switch (chr) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(chr + " is a vowel");
                default -> System.out.println(chr + " is a consonant");
        }

    }
    public static void reverse(){

        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a word: ");
        String normal = scan.nextLine();
        String reversed = "";
        for (int i = normal.length() - 1; i >= 0; i--) {

            reversed += normal.charAt(i);
        }
            System.out.println("Reversed word is: " + reversed);

    }
}
