import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(6);

        integers.addAll(List.of(4,7,4,9,2,3));

        integers.sort(new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }


        });{

            System.out.println("Sorted list: " + integers);

        }

    }
}