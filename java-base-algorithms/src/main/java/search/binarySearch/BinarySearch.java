package search.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {1, 4, 6, 3, 5, 19, 10, 44, 2, 3, 45};
        int value = 45;

        Arrays.sort(list);

        int listIdxRec = binarySearchRecursive(list, 0, list.length - 1, value);

        if (listIdxRec == -1) {
            System.out.printf("The value %s was not found in array", value);
        } else {
            System.out.printf("The value %s was found at index %s", value, listIdxRec);
        }

        System.out.println("\n");

        int listIdxIt = binarySearchIterative(list, value);

        if (listIdxIt == -1) {
            System.out.printf("The value %s was not found in array", value);
        } else {
            System.out.printf("The value %s was found at index %s", value, listIdxIt);
        }
    }

    public static int binarySearchRecursive(int[] list, int lowIdx, int highIdx, int value) {
        if (highIdx >= lowIdx) {
            int midIdx = lowIdx + (highIdx - lowIdx) / 2;

            if (value == list[midIdx]) {
                return midIdx;
            }

            if (value < list[midIdx]) {
                return binarySearchRecursive(list, lowIdx, midIdx - 1, value); // Left part of the Array
            }

            return binarySearchRecursive(list, midIdx + 1, highIdx, value); // Right part of the Array
        }

        return -1;
    }

    public static int binarySearchIterative(int[] list, int value) {
        int lowIdx = 0;
        int highIdx = list.length - 1;

        while (lowIdx <= highIdx) {
            int midIdx = lowIdx + (highIdx - lowIdx) / 2;

            if (value == list[midIdx]) {
                return midIdx;
            }

            if (value > list[midIdx]) {
                lowIdx = midIdx + 1; // Left part of the Array
            } else {
                highIdx = midIdx - 1; // Right part of the Array
            }
        }

        return -1;
    }
}
