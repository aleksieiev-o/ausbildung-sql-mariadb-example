package search.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] list = {3, 5, 9, 1, 10, 33, 55, 20, 7};
        int value = 10;

        int listIdx = linearSearch(list, value);

        if (listIdx == -1) {
            System.out.printf("The value %s was not found in array", value);
        } else {
            System.out.printf("The value %s was found at index %s", value, listIdx);
        }
    }

    public static int linearSearch(int[] list, int value) {
        if (list == null) {
            return -1;
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
