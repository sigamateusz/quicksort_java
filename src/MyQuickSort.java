import java.util.ArrayList;

public class MyQuickSort {

    private static ArrayList<Integer> quickSort(ArrayList<Integer> toSort) {

        if ( toSort.size() > 1 ) {
            Integer pivot = toSort.get(0);
            ArrayList<Integer> less = new ArrayList<>();
            ArrayList<Integer> equal = new ArrayList<>();
            ArrayList<Integer> greater = new ArrayList<>();

            for (Integer number: toSort) {
                if ( number < pivot ) {
                    less.add(number);
                } else if (number.equals(pivot)) {
                    equal.add(number);
                } else {
                    greater.add(number);
                }
            }

            ArrayList<Integer> result = new ArrayList<>();
            result.addAll(quickSort(less));
            result.addAll(equal);
            result.addAll(quickSort(greater));

            return result;
        }
        return toSort;
    }

    public static void main (String[] args) {
//        FileOperations.readFromFile();
        ArrayList<Integer> x = new ArrayList<>();
        x.add(5);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(15);
        x.add(11);
        x.add(11);

        for (Object i: quickSort(x)) {
            System.out.println(i);
        }
    }
}