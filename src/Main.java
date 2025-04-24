import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }

        System.out.println("Original: " + numbers);

        NumberFilter filter = new NumberFilter();

        System.out.println("Even numbers only : " + filter.removeOddNumbers(numbers));
        System.out.println("Odd numbers only  : " + filter.removeEvenNumbers(numbers));
    }
}
