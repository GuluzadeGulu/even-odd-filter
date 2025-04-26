import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание списка целых чисел от 0 до 10
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            numbers.add(i);
        }

        // Вывод оригинального списка
        System.out.println("Original: " + numbers);

        // Создание экземпляра фильтра чисел
        NumberFilter filter = new NumberFilter();

        // Вывод списка только с чётными числами
        System.out.println("Even numbers only : " + filter.removeOddNumbers(numbers));

        // Вывод списка только с нечётными числами
        System.out.println("Odd numbers only  : " + filter.removeEvenNumbers(numbers));
    }
}