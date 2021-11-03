public class BinaryTree
{
  private String value;
  private BinaryTree left;
  private BinaryTree right;

  public BinaryTree(String value)
  {
    this.value = value;
    left = null;
    right = null;
  }

  public BinaryTree(String value, BinaryTree left, BinaryTree right)
  {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public BinaryTree getLeft()
  {
    return left;
  }

  public BinaryTree getRight()
  {
    return right;
  }

  public String getValue()
  {
    return value;
  }

  public void setLeft(BinaryTree left)
  {
    this.left = left;
  }

  public void setRight(BinaryTree right)
  {
    this.right = right;
  }

  public void setVale(String value)
  {
    this.value = value;
  }

  public List<String> inOrder()
  {
    List<String> values = new ArrayList<String>();
    _inOrder(this, values);

    return values;
  }

  private void _inOrder(BinaryTree tree, List<String> values)
  {

  }

  public List<String> preOrder()
  {
    List<String> values = new ArrayList<String>();
    _preOrder(this, values);

    return values;
  }

  private void _preOrder(BinaryTree tree, List<String> values)
  {

  }

  public List<String> postOrder()
  {
    List<String> values = new ArrayList<String>();
    _postOrder(this, values);

    return values;
  }

  private void _postOrder(BinaryTree tree, List<String> values)
  {

  }
}