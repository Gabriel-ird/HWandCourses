public class Swap{
    public static void main(String[] args) {

        int a = 8;
        int b = 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Swapping a and b results in:");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
