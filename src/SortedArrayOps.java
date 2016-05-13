import java.util.HashMap;
import java.util.Map;

public class SortedArrayOps {

    public static int[] singleLoopSort(int[] array){
        boolean changed = false;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                array[i] = array[i] + array[i+1];
                array[i+1] = array[i] - array[i+1];
                array[i] = array[i] - array[i+1];
                changed = true;
            }

            if (changed && i == array.length-2) {
                i = -1;
                changed = false;
            }
        }
        return array;
    }

    public static String printIntSumValues(final int sum, int sortedInts[]) {
        Map<Integer, Integer> numbers = new HashMap<>();
        String result = "no matches";

        for (int i = 0; i < sortedInts.length; i++) {
            int distinction = sum-sortedInts[i];

            if (numbers.containsKey(distinction)) {
                result = sortedInts[numbers.get(distinction)] +" " + sortedInts[i];
                System.out.println(result);
                return result;
            } else if (!numbers.containsKey(sortedInts[i]) && sortedInts[i] != 0) {
                numbers.put(sortedInts[i], i);
            }
        }
        System.out.println(result);
        return result;
    }
}