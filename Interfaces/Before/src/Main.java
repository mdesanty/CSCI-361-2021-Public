public class Main {
    public static void main(String[] args) {
      Main main = new Main();
      main.go();
    }

    public void go() {
      Rectangle rectangle = new Rectangle(10, 20);
      System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

      Square square = new Square(5);
      System.out.println("Square perimeter: " + square.getPerimeter());

      Triangle triangle = new Triangle(4, 5, 6);
      System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }

    private class Rectangle {
        private int width;
        private int height;

        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int getPerimeter() {
            return 2 * width + 2 * height;
        }
    }

    private class Square {
        private int a;

        public Square(int a) {
            this.a = a;
        }

        public int getPerimeter() {
            return 4 * a;
        }
    }

    private class Triangle {
        private int a;
        private int b;
        private int c;

        public Triangle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int getPerimeter() {
            return a + b + c;
        }
    }
}