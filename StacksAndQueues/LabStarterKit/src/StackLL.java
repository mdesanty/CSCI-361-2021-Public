public class StackLL<T> implements IStack<T>
{
  private Node head;
  private int count;

  public StackLL()
  {
    head = new Node(null);
    count = 0;
  }

  @Override
  public void push(T item)
  {
    // runs in constant time...

    Node node = new Node(item);

    node.next = head.next;
    head.next = node;

    count++;
  }

  @Override
  public T pop()
  {
    // runs in constant time...

    if (isEmpty())
      throw new IllegalStateException("pop error: stack is empty!");

    count--;

    T ret = head.next.data;
    head.next = head.next.next;

    return ret;
  }

  @Override
  public T top()
  {
    // runs in constant time...

    if (isEmpty())
      throw new IllegalStateException("top error: stack is empty!");

    return  head.next.data;
  }

  @Override
  public boolean isEmpty()
  {
    // runs in constant time: O(1)
    return getSize() == 0;
  }

  @Override
  public int getSize()
  {
    // runs in constant time: O(1)
    return count;
  }

  @Override
  public String toString()
  {
    // runs in linear time: O(n)

    StringBuffer sb = new StringBuffer("top->");
    if (!isEmpty())
    {
      Node node = head.next;
      sb.append(node.data.toString());

      while (node.next != null)
      {
        node = node.next;
        sb.append("->");
        sb.append(node.data.toString());
      }
    }
    return sb.toString();
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