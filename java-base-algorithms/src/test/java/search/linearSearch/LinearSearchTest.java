
package search.linearSearch;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class LinearSearchTest {
    @Test
    void testEmptyArray() {
        int[] list = {};
        int result = LinearSearch.linearSearch(list, 10);

        assertEquals(-1, result);
    }

    @Test
    void testSingleElement_Found() {
        int[] list = {10};
        int result = LinearSearch.linearSearch(list, 10);

        assertEquals(0, result);
    }

    @Test
    void testSingleElement_NotFound() {
        int[] list = {5};
        int result = LinearSearch.linearSearch(list, 10);

        assertEquals(-1, result);
    }

    @Test
    void testNotFound() {
        int[] list = {3, 5, 9, 1};
        int result = LinearSearch.linearSearch(list, 10);

        assertEquals(-1, result);
    }

    @Test
    void testMultipleOccurrences_ReturnsFirstIndex() {
        int[] list = {3, 10, 5, 10, 9};
        int result = LinearSearch.linearSearch(list, 10);

        assertEquals(1, result); // first occurrence
    }

    @Test
    void testValueAtBeginning() {
        int[] list = {10, 3, 5, 9};
        int result = LinearSearch.linearSearch(list, 10);

        assertEquals(0, result);
    }

    @Test
    void testValueAtEnd() {
        int[] list = {3, 5, 9, 10};
        int result = LinearSearch.linearSearch(list, 10);

        assertEquals(3, result);
    }

    @Test
    void testNegativeNumbers() {
        int[] list = {-3, -10, -5, -1};
        int result = LinearSearch.linearSearch(list, -5);

        assertEquals(2, result);
    }

    @Test
    void testNullArray() {
        int result = LinearSearch.linearSearch(null, 10);
        assertEquals(-1, result);
    }
}
