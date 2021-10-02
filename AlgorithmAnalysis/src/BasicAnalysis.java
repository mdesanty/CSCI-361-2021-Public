import java.util.Scanner;

public class BasicAnalysis {
    public static void main(String[] args) {
        BasicAnalysis main = new BasicAnalysis();

        // main.algorithmOne();
        // main.algorithmTwo();
        // main.algorithmThree();
        // main.algorithmFour();
        // main.algorithmFive();
        // main.algorithmSix();
        // main.algorithmSeven();
    }

    private void algorithmOne() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);
    }

    private void algorithmTwo() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }
    }

    private void algorithmThree() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }

    private void algorithmFour() {
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

    private void algorithmFive() {
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

    private void algorithmSix() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        System.out.println(n);

        for(int i = 1; i < Math.pow(5, n); i++) {
            System.out.println(i);
        }
    }

    private void algorithmSeven() {
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