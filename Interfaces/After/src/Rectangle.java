public class Rectangle implements IShape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getPerimeter() {
        return 2 * width + 2 * height;
    }
}