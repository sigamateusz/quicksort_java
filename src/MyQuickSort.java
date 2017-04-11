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
        String filename = args[0];
        ArrayList<Integer> fromFile = FileOperations.readFromFile(filename);
        ArrayList<Integer> sortedList = quickSort(fromFile);

        FileOperations.writeToFile(sortedList, filename);
    }
}