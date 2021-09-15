import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();

        System.out.println("With loop: " + factorialWithLoop(n));
        System.out.println("With recursion: " + factorial(n));
    }

    public static int factorial(int n) {
        if(n == 1 || n == 0)
            return 1;
        else 
            return n * factorial(n - 1);
    }

    public static int factorialWithLoop(int n) {
        int answer = 1;
        for (int i = n; i > 0; i--)
            answer = i * answer;

        return answer;
    }
}