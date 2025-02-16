import java.util.List;

public class Ex2 {

    public static void main(String[] args) {

        List<String> strings = List.of("audi", "mercedes", "cupra", "atom");

        List<String> filterA = strings.stream()
                .filter(s -> s.startsWith("a"))
                .toList();

        System.out.println("Filtered list: " + filterA);

    }
}
