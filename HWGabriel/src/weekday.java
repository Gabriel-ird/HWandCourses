import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int weekDay = scanner.nextInt();


        String weekDayText = switch (weekDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println("Day " + weekDay + " is " + weekDayText);

    }
}
