import java.util.List;
import java.util.function.Predicate;

public class Ex3 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 13, 5, 15, 7, 55, 10);

        Predicate<Integer> isGreaterThanTen = number -> number > 10;

        List<Integer> filteredNumbers = numbers.stream()
                .filter(isGreaterThanTen)
                .toList();

        System.out.println("Numbers greater than 10: " + filteredNumbers);
    }
}
