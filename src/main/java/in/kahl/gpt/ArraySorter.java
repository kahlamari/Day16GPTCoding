package in.kahl.gpt;
// Class ArraySorter contains methods for sorting arrays
public class ArraySorter {

    // Main method to demonstrate the sorting functionality
    public static void main(String[] args) {
        // Initializing an array with specific values
        int[] array = {5, 2, 9, 1, 5, 6};

        // Printing the original array
        System.out.println("Original array:");
        for (int number : array) {
            System.out.print(number + " ");
        }

        // Sorting the array using the bubble sort method
        bubbleSort(array);

        // Printing the sorted array
        System.out.println("\nSorted array:");
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    // Method to sort an array using bubble sort algorithm
    public static void bubbleSort(int[] array) {
        // Length of the array
        int length = array.length;
        // Boolean flag to check if a swap occurred
        boolean swapped;

        // Loop to keep running the sorting until no swap is needed
        do {
            swapped = false;

            // Iterating through the array
            for (int i = 1; i < length; i++) {
                // Comparing adjacent elements and swapping if needed
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
            // Decrementing the length to optimize the sort
            length--;
        } while (swapped);
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        // Temporary variable to hold one of the values during the swap
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
