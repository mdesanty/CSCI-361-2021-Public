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

    Node node = new Node(item);
    node.next = head.next;
    head.next = node;
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
    Node current = head;

    // while not at the tail...
    while (current.next != null)
    {
      // if I am at the second from the tail of the queue...
      if (current.next.next == null)
      {
        // grab the data from the last item in the queue...
        ret = current.next.data;

        // detatch the last item in the queue...
        current.next = null;

        break;
      }
      else
      {
        // otherwise, continue moving towards the tail of the queue...
        current = current.next;
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