import java.util.Scanner;

public class BasicAnalysis {
    public static void main(String[] args) {
        BasicAnalysis main = new BasicAnalysis();

        main.constantTime();
        main.logorithmicTime();
        main.linearTime();
        main.superLinearTime();
        main.quadraticTime();
        main.cubicTime();
        main.exponentialTime();
        main.factorialTime();
    }

    // f(n) = c
    // O(n) = c
    // Constant
    private void constantTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);
    }

    // f(n) = c * log(n) + c
    // O(n) = log(n)
    // Logorithmic
    private void logorithmicTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }
    }

    // f(n) = c * n + c
    // O(n) = n
    // Linear
    private void linearTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }

    // f(n) = c * n * log(n) + c
    // O(n) = n * log(n)
    // Superlinear
    private void superLinearTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j = j * 2) {
                System.out.println(i * j);
            }
        }
    }

    // f(n) = c * n^2 + c
    // O(n) = n^2
    // Quadratic
    private void quadraticTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                System.out.println(i * j);
            }
        }
    }

    // f(n) = c * n^3 + c
    // O(n) = n^3
    // Cubic
    private void cubicTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < n; j++) {
                for(int k = 1; k < n; k++) {
                    System.out.println(i * j * k);
                }
            }
        }
    }

    // f(n) = c * c^n + c
    // O(n) = c^n
    // Exponential
    private void exponentialTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < Math.pow(5, n); i++) {
            System.out.println(i);
        }
    }

    // f(n) = c * n! + c
    // O(n) = n!
    // Factorial
    private void factorialTime() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < factorial(n); i++) {
            System.out.println(i);
        }
    }

    private int factorial(int n) {
        if(n == 1 || n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
}