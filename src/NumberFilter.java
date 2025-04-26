import java.util.ArrayList;

public class NumberFilter {

    public ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list){
        // Создаём копию списка для сохранения оригинала
        ArrayList<Integer> listCopy = new ArrayList<>(list);

        // Удаляем все элементы, которые делятся на 2 без остатка (чётные)
        listCopy.removeIf(n -> n % 2 == 0);
        return listCopy;
    }

    public ArrayList<Integer> removeOddNumbers(ArrayList<Integer> list){
        // Создаём копию списка для сохранения оригинала
        ArrayList<Integer> listCopy = new ArrayList<>(list);

        // Удаляем все элементы, которые не делятся на 2 без остатка (нечётные)
        listCopy.removeIf(n -> n % 2 != 0);
        return listCopy;
    }
}