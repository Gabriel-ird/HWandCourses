import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.print("Enter the number of elements: ");
        int size = scan.nextInt();


        int[] numbers = new int[size];


        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }


        int max = findMax(numbers);
        int min = findMin(numbers);
        double average = calculateAverage(numbers);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

        scan.close();
    }


    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}
