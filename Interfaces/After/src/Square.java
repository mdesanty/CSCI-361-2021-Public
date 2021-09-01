public class Square implements IShape {
  private int a;

  public Square(int a) {
    this.a = a;
  }

  @Override
  public int getPerimeter() {
    return 4 * a;
  }
}