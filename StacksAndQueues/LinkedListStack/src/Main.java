public class Main
{
  public static void main(String[] args)
  {
    /* Expected output:
     * Stack test:
     *
     * top->this->will->make->sense
     *
     * this
     *
     * this
     * will
     * make
     * sense
     *
     * Queue test:
     *
     * rear->B->A->C
     *
     * C
     * A
     * B
     *
     */

    Main main = new Main();

    main.testStack();
    System.out.println();

    main.testQueue();
  }

  private void testStack()
  {
    System.out.println("Stack test: \n");

    IStack<String> strings = new StackLL<String>();

    strings.push("sense");
    strings.push("make");
    strings.push("will");
    strings.push("this");

    System.out.println(strings);
    System.out.println();

    System.out.println(strings.top());
    System.out.println();

    while(!strings.isEmpty())
    {
      System.out.println(strings.pop());
    }
  }

  private void testQueue()
  {
    System.out.println("Queue test: \n");

    IQueue<String> strings = new QueueLL<String>();

    strings.enqueue("C");
    strings.enqueue("A");
    strings.enqueue("B");

    System.out.println(strings);
    System.out.println();

    while(!strings.isEmpty())
    {
      System.out.println(strings.dequeue());
    }
  }
}