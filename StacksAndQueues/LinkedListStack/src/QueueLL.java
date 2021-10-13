import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class QueueLL<T extends Comparable<T>> implements IQueue<T>
{
  private Node head;
  private int count;

  public QueueLL()
  {
    head = new Node(null);
    count = 0;
  }

  @Override
  public void enqueue(T item)
  {
    // runs in constant time: O(1)
    // FIFO: this operation places new items at the head of the linked list.

    Node n = new Node(item);
    n.next = head.next;
    head.next = n;
    count++;
  }

  @Override
  public T dequeue()
  {
    // runs in linear time: O(n)
    // FIFO: this operation removes an item from the tail of the linked list.

    if (isEmpty())
      throw new IllegalStateException("dequeue error: queue is empty!");

    T ret = null;
    Node cur = head;

    // while not at the tail...
    while (cur.next != null)
    {
      // if I am at the second from the tail of the queue...
      if (cur.next.next == null)
      {
        // grab the data from the last item in the queue...
        ret = cur.next.data;

        // detatch the last item in the queue...
        cur.next = null;

        break;
      }
      else
      {
        // otherwise, continue moving towards the tail of the queue...
        cur = cur.next;
      }
    }

    count--;
    return ret;
  }

  @Override
  public boolean isEmpty()
  {
    return getSize() == 0;
  }

  @Override
  public int getSize()
  {
    return count;
  }

  @Override
  public String toString()
  {
    // runs in linear time: O(n)

    StringBuffer buffer = new StringBuffer("rear->");
    if (!isEmpty())
    {
      Node node = head.next;
      buffer.append(node.data.toString());
      while (node.next != null)
      {
        node = node.next;
        buffer.append("->");
        buffer.append(node.data.toString());
      }
    }
    return buffer.toString();
  }

  private class Node
  {
    private T data;
    private Node next;

    public Node(T data)
    {
      this.data = data;
      next = null;
    }
  }
}