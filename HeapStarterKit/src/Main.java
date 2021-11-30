import java.util.List;
import java.util.Arrays;

/*
* Heap node relationship formulas where i is the index of the current node:
* Index of left child =  2i + 1
* Index of right child = 2i + 2
* Index of parent = (i - 1) / 2
*/
public class Main {
  public static void main(String[] args) {
    Integer[] ary = {2, 5, 9, 3};
    List<Integer> items = Arrays.asList(ary);
    Heap heap = new Heap();

    heap.insertAll(items);
    /*
    * 2 is inserted resulting in tree:
    * 2
    * No reheapUp is required as 2 is the only node.
    * Backing Array index/items:
    * Index: 0
    * Item:  2
    *
    * 5 is inserted resultingin tree:
    *     2
    *   /
    * 5
    * reheapUp is called. 5 and 2 are swapped resulting in heap:
    *     5
    *   /
    * 2
    * Backing Array index/items:
    * Index: 0 1
    * Item:  5 2
    *
    * 9 is inserted resulting in tree:
    *     5
    *   /  \
    * 2     9
    * reheapUp is called. 9 and 5 are swapped resulting in heap:
    *     9
    *   /  \
    * 2     5
    * Backing Array index/items:
    * Index: 0 1 2
    * Item:  9 2 5
    *
    * 3 is inserted resulting in tree:
    *        9
    *      /  \
    *    2     5
    *   /
    * 3
    * reheapUp is called. 3 and 2 are swapped resulting in heap:
    *        9
    *      /  \
    *    3     5
    *   /
    * 2
    * Backing Array index/items:
    * Index: 0 1 2 3
    * Item:  9 3 5 2
    */
    System.out.println("Heap: " + heap); // Expected outpus: Heap: [9, 3, 5, 2]

    /*
    * What happens in this loop?...
    * Starting Heap:
    *        9
    *      /  \
    *    3     5
    *   /
    * 2
    * Backing Array index/items:
    * Index: 0 1 2 3
    * Item:  9 3 5 2
    *
    * Iteration 1:
    * 9 is removed and the root is reset to 2 resulting in the tree:
    *     2
    *   /  \
    * 3     5
    * reheapDown is called resulting in the heap:
    *     5
    *   /  \
    * 3     2
    * Backing Array index/items:
    * Index: 0 1 2
    * Item:  5 3 2
    *
    * Iteration 2:
    * 5 is removed and the root is reset to 2 resulting in the tree:
    *     2
    *   /
    * 3
    * reheapDown is called resulting in the heap:
    *     3
    *   /
    * 2
    * Backing ArrayList index/items:
    * Index: 0 1
    * Item:  3 2
    *
    * Iteration 3:
    * 3 is removed and the root is reset to 2 resulting in the tree:
    *     2
    * reheapDown is called resulting in the heap:
    *     2
    * Backing ArrayList index/items:
    * Index: 0
    * Item:  2
    *
    * Iteration 4:
    * 2 (the last node of the heap) is removed.
    * With the tree being empty, reheapDown does nothing.
    */
    while(heap.size() > 0)
    {
      /*
      * Expected output of the loop:
      * Top: 9
      * New Heap: [5, 3, 2]
      * Top: 5
      * New Heap: [3, 2]
      * Top: 3
      * New Heap: [2]
      * Top: 2
      * New Heap: []
      */
      System.out.println("Top: " + heap.removeTop());
      System.out.println("New Heap: " + heap.toString());
    }

    heap.insertAll(items);
    System.out.println("Heap: " + heap); // Expected outpus: Heap: [9, 3, 5, 2]

    heap.clear();
    System.out.println("Heap: " + heap); // Expected outpus: Heap: []
  }
}