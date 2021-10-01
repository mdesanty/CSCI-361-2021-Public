import java.util.Arrays;

public class BubbleSort {

  /* https://www.geeksforgeeks.org/bubble-sort/
   *
   *Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
   * Example: 
   *
   * First Pass: 
   * ( [5 1] 4 2 8 ) –> ( [1 5] 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
   * ( 1 [5 4] 2 8 ) –> ( 1 [4 5] 2 8 ), Swap since 5 > 4
   * ( 1 4 [5 2] 8 ) –> ( 1 4 [2 5] 8 ), Swap since 5 > 2
   * ( 1 4 2 [5 8] ) –> ( 1 4 2 [5 8] ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
   *
   * Second Pass: 
   * ( [1 4] 2 5 8 ) –> ( [1 4] 2 5 8 )
   * ( 1 [4 2] 5 8 ) –> ( 1 [2 4] 5 8 ), Swap since 4 > 2
   * ( 1 [2 4] 5 8 ) –> ( 1 2 [4 5] 8 )
   * ( 1 2 4 [5 8] ) –> ( 1 2 4 [5 8] )
   *
   * Now, the array is already sorted, but our algorithm does not know if it is completed.
   * The algorithm needs one whole pass without any swap to know it is sorted.
   * Third Pass: 
   * ( [1 2] 4 5 8 ) –> ( [1 2] 4 5 8 )
   * ( 1 [2 4] 5 8 ) –> ( 1 [2 4] 5 8 )
   * ( 1 2 [4 5] 8 ) –> ( 1 2 [4 5] 8 )
   * ( 1 2 4 [5 8] ) –> ( 1 2 4 [5 8] )
   * 
   */
  public static void sort(int[] numbers) {
    boolean swapped;

    for (int i = 0; i < numbers.length - 1; i++)
    {
      swapped = false;
      for (int j = 0; j < numbers.length - 1; j++)
      {
        if (numbers[j] > numbers[j + 1])
        {
          // swap numbers[j] and numbers[j+1]
          int temp = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = temp;
          swapped = true;
        }
      }

      // If NO two elements were
      // swapped by inner loop, then break
      if (swapped == false)
        break;
    }
  }
  
  public static void main(String[] args) {
    int[] numbers = {6, 4, 3, 7, 9};

    System.out.println(Arrays.toString(numbers));

    BubbleSort.sort(numbers);
    System.out.println(Arrays.toString(numbers));
  }
}

/* Performance:
 * f(n) = c * n^2 + c
 * O(n) = n^2
 *
 * There is a best case scenario when the array is already sorted:
 * f(n) = c * n + c
 * O(n) = n
 * /