package in.kahl.gpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySorterTest {

    @Test
    void testBubbleSortWithUnsortedArray() {
        int[] unsortedArray = {5, 2, 9, 1, 5, 6};
        int[] expectedSortedArray = {1, 2, 5, 5, 6, 9};
        ArraySorter.bubbleSort(unsortedArray);
        assertArrayEquals(expectedSortedArray, unsortedArray);
    }

    @Test
    void testBubbleSortWithEmptyArray() {
        int[] emptyArray = {};
        ArraySorter.bubbleSort(emptyArray);
        assertArrayEquals(emptyArray, new int[]{});
    }

    @Test
    void testBubbleSortWithAlreadySortedArray() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        ArraySorter.bubbleSort(sortedArray);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sortedArray);
    }
}