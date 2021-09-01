import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<IShape> shapes = new ArrayList<IShape>();

        shapes.add(new Rectangle(10, 20));
        shapes.add(new Square(5));
        shapes.add(new Triangle(4, 5, 6));

        for(IShape shape: shapes) {
            System.out.println(shape.getClass().getName() + " perimeter: " + shape.getPerimeter());
        }
    }
}