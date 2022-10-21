import algorithms.InsertionSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestInsertionSort {
    @BeforeEach
    public void runBefore() {}
    InsertionSort testInsertionSort = new InsertionSort();
    int[] sortedIntegers = {1,2,3,4,5};
    int[] unsortedIntegers = {3,1,2,4,5};
    int[] longUnsortedInts = {10, 9 , 8, 6, 7, 5, 4, 3, 2, 1, 0};

    @Test
    public void testAlreadySorted() {
        assertEquals(sortedIntegers, testInsertionSort.insertionSort(sortedIntegers));
    }

    @Test
    public void testNotSorted() {
        int [] integers = testInsertionSort.insertionSort(unsortedIntegers);
        assertEquals(unsortedIntegers, integers);
        testInsertionSort.printElements(integers);
    }

    @Test
    public void testLongNotSorted() {
        int [] integers = testInsertionSort.insertionSort(longUnsortedInts);
        assertEquals(longUnsortedInts, integers);
        testInsertionSort.printElements(integers);
    }
}
