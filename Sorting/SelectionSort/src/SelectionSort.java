import java.util.Arrays;

public class SelectionSort {

  /* https://stackabuse.com/selection-sort-in-java/
   *
   * The algorithm divides the array into two subarrays:
   *
   * A sorted subarray
   * An unsorted subarray
   * The sorted subarray is empty in the beginning. In every iteration, the smallest element of the unsorted array will be appended to
   * the end of the sorted array by swapping. This way, the sorted array will eventually contain all the elements of the original array.
   *
   * An example array we want to sort in ascending order (each line represents an iteration of the algorithm):
   *
   * Sorted subarray       Unsorted subarray     Minimal element of the unsorted array
   * []                    [16, 5, 30, 6, 2, 7]  2
   * [2]                   [16, 5, 20, 6, 7]     5
   * [2, 5]                [16, 20, 6, 7]        6
   * [2, 5, 6]             [16, 7, 20]           7
   * [2, 5, 6, 7]          [16, 20]              16
   * [2, 5, 6, 7, 16]      [20]                  20
   * [2, 5, 6, 7, 16, 20]	 []                    -
   *
   */
  public static void sort(int[] numbers) {
    for(int i = 0; i < numbers.length; i++) {
      int minIndex = i;

      for(int j = i + 1; j < numbers.length; j++) {
        if(numbers[j] < numbers[minIndex])
          minIndex = j;
      }

      int swap = numbers[i];
      numbers[i] = numbers[minIndex];
      numbers[minIndex] = swap;
    }
  }

  public static void main(String[] args) {
    int[] numbers = {6, 4, 3, 7, 9};

    System.out.println(Arrays.toString(numbers));

    SelectionSort.sort(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}

/*
 * Performance:
 * n/2 * (n -1) + c
 * f(n) = (n^2 - n) / 2 + c
 * O(n) = n^2
 * /