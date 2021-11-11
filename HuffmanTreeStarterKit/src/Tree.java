public class Tree implements Comparable {
  private Tree left;
  private Tree right;
  private char charecter;
  private int weight;

  public Tree(Tree left, Tree right, char charecter, int weight)	{
    this.left = left;
    this.right = right;
    this.charecter = charecter;
    this.weight = weight;
  }

  public Tree getLeft()	{
    return left; 
  }
	
  public Tree getRight() {
    return right; 
  }
	   
  public int getweight()	{
    return weight;
  }
	
  public char getCharecter() {
    return charecter;
  }
	
  public void printTree() {
    _printTree(this);
  }
	
  public void _printTree(Tree n) {
    // add code here to print the tree
    // using a preorder traversal...
  }
	
  @Override
  public String toString() {
    return String.format("%s (%2d)", getCharecter(), getweight());
  }
	
  @Override
  public int compareTo(Tree other)	{
    // add code here to ensure that the natural ordering
    // sorts trees in ascending order based on the tree's weight,
    // in the case of a tie sort in ascending order
    // based on the tree's letter...
  }
}