package search.binarySearch;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testEmptyArray() {
        int[] list = {};
        int value = 10;

        Arrays.sort(list);

        assertEquals(-1, BinarySearch.binarySearchRecursive(list, 0, list.length - 1, value));
        assertEquals(-1, BinarySearch.binarySearchIterative(list, value));
    }

    @Test
    void testSingleElementFound() {
        int[] list = {5};
        int value = 5;

        Arrays.sort(list);

        assertEquals(0, BinarySearch.binarySearchRecursive(list, 0, list.length - 1, value));
        assertEquals(0, BinarySearch.binarySearchIterative(list, value));
    }

    @Test
    void testSingleElementNotFound() {
        int[] list = {5};
        int value = 10;

        Arrays.sort(list);

        assertEquals(-1, BinarySearch.binarySearchRecursive(list, 0, list.length - 1, value));
        assertEquals(-1, BinarySearch.binarySearchIterative(list, value));
    }

    @Test
    void testNotFound() {
        int[] list = {1, 2, 3, 4, 5};
        int value = 10;

        Arrays.sort(list);

        assertEquals(-1, BinarySearch.binarySearchRecursive(list, 0, list.length - 1, value));
        assertEquals(-1, BinarySearch.binarySearchIterative(list, value));
    }

    @Test
    void testMultipleOccurrences() {
        int[] list = {1, 2, 3, 3, 3, 4, 5};
        int value = 3;

        Arrays.sort(list);

        int recIndex = BinarySearch.binarySearchRecursive(list, 0, list.length - 1, value);
        int itIndex = BinarySearch.binarySearchIterative(list, value);

        assertTrue(recIndex >= 0 && list[recIndex] == value);
        assertTrue(itIndex >= 0 && list[itIndex] == value);
    }
}
