public class Ex5 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface Calculator {
            int calculate(int a, int b);
        }

        Calculator addition = (a, b) -> a + b;

        Calculator subtraction = (a, b) -> a - b;

        Calculator multiplication = (a, b) -> a * b;

        Calculator division = (a, b) -> a/b;

        int x = 7;
        int y = 3;

        System.out.println("Addition: " + addition.calculate(x, y));
        System.out.println("Subtraction: " + subtraction.calculate(x, y));
        System.out.println("Multiplication: " + multiplication.calculate(x, y));
        System.out.println("Division: " + division.calculate(x, y));

    }
}
