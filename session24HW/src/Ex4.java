import java.util.List;
import java.util.function.Consumer;

public class Ex4 {
    public static void main(String[] args) {

        List<String> strings = List.of("name", "age", "weight", "height");

        Consumer<String> printConsumer = System.out::println;

        strings.forEach(printConsumer);
    }
}
