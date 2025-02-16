import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {

        System.out.println("Enter a character: ");

        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);

        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println(letter + " is a vowel");
            }
                default -> {
                    if (Character.isLetter(letter)) {
                        System.out.println(letter + " is a consonant");
                    }
                    else {
                        System.out.println(letter + " is an invalid character");
                    }
                }
            }
        }
    }


