import java.util.ArrayList;

public class NumberFilter {

    public ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list){
        @SuppressWarnings("unchecked")
        ArrayList<Integer> listCopy = (ArrayList<Integer>) list.clone();
        listCopy.removeIf(n -> n % 2 == 0);
        return listCopy;
    }

    public ArrayList<Integer> removeOddNumbers(ArrayList<Integer> list){
        @SuppressWarnings("unchecked")
        ArrayList<Integer> listCopy = (ArrayList<Integer>) list.clone();
        listCopy.removeIf(n -> n % 2 != 0);
        return listCopy;
    }
}