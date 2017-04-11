import java.util.ArrayList;

public class MyQuickSort {

    private static ArrayList<Integer> QuickSort(ArrayList<Integer> toSort) {

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
            result.addAll(QuickSort(less));
            result.addAll(equal);
            result.addAll(QuickSort(greater));

            return result;
        }
        return toSort;
    }

    public static void main (String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(5);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(15);
        x.add(11);
        x.add(11);

        for (Object i: QuickSort(x)) {
            System.out.println(i);
        }
    }
}