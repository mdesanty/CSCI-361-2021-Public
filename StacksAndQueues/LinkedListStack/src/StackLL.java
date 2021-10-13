public class StackLL<T> implements IStack<T>
{
  private LinkedListNode<T> head;
  private int count;

  public StackLL()
  {
    head = new LinkedListNode<T>(null);
  }

  @Override
  public void push(T item)
  {
    // runs in constant time...

    LinkedListNode<T> node = new LinkedListNode<T>(item);

    node.setNext(head.getNext());
    head.setNext(node);

    count++;
  }

  @Override
  public T pop()
  {
    // runs in constant time...

    if (isEmpty())
      throw new IllegalStateException("pop error: stack is empty!");

    count--;

    T ret = head.getNext().getData();
    head.setNext(head.getNext().getNext());

    return ret;
  }

  @Override
  public T top()
  {
    // runs in constant time...

    if (isEmpty())
      throw new IllegalStateException("top error: stack is empty!");

    return  head.getNext().getData();
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
      LinkedListNode<T> node = head.getNext();
      sb.append(node.getData().toString());

      while (node.getNext() != null)
      {
        node = node.getNext();
        sb.append("->");
        sb.append(node.getData().toString());
      }
    }
    return sb.toString();
  }
}