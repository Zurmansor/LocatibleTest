import org.junit.Test;

import static org.junit.Assert.*;

public class SortedArrayOpsTest {

    @Test
    public void testSingleLoopSortPositiveNumbers() throws Exception {
        int[] source = {0,7,10,2,5,8,0,9};
        final int[] sortedArray = SortedArrayOps.singleLoopSort(source);
        assertArrayEquals(sortedArray, new int[]{0,0,2,5,7,8,9,10});
    }

    @Test
    public void testSingleLoopSortNegativeNumbers() throws Exception {
        int[] source = {-7,-2,-5,-8,-12,-4};
        final int[] sortedArray = SortedArrayOps.singleLoopSort(source);
        assertArrayEquals(sortedArray, new int[]{-12,-8,-7,-5,-4,-2});
    }

    @Test
    public void testSingleLoopSortMixedNumbers() throws Exception {
        int[] source = {-5,10,2,-12,-9,7,0,-7,4};
        final int[] sortedArray = SortedArrayOps.singleLoopSort(source);
        assertArrayEquals(sortedArray, new int[]{-12,-9,-7,-5,0,2,4,7,10});
    }

    @Test
    public void testSingleLoopSortRepeatedNumbers() throws Exception {
        int[] source = {1,0,2,0,1,1,0,1,1};
        final int[] sortedArray = SortedArrayOps.singleLoopSort(source);
        assertArrayEquals(sortedArray, new int[]{0,0,0,1,1,1,1,1,2});
    }

    @Test
    public void testPrintIntSumValuesPositiveNumbers() throws Exception {
        int sum = 10;
        int[] sortedArray = {0,1,2,3,7,8,9,10};
        String checkedString = SortedArrayOps.printIntSumValues(sum, sortedArray);
        assertEquals(checkedString, "3 7");
    }

    @Test
    public void testPrintIntSumValuesNegativeNumbers() throws Exception {
        int sum = -3;
        int[] sortedArray = {-12,-9,-7,-5,-2,-1};
        String checkedString = SortedArrayOps.printIntSumValues(sum, sortedArray);
        assertEquals(checkedString, "-2 -1");
    }

    @Test
    public void testPrintIntSumValuesFirstNumbers() throws Exception {
        int sum = 10;
        int[] sortedArray = {0,1,2,3,4,5,6,7,8,9,10};
        String checkedString = SortedArrayOps.printIntSumValues(sum, sortedArray);
        assertEquals(checkedString, "4 6");
    }

    @Test
    public void testPrintIntSumValuesZero() throws Exception {
        int sum = 10;
        int[] sortedArray = {0,10};
        String checkedString = SortedArrayOps.printIntSumValues(sum, sortedArray);
        assertEquals(checkedString, "no matches");
    }
}