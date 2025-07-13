import java.util.Scanner;

// Time Complexity = O(2^n), Space Complexity = O(n)
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n) to find the nth Fibonacci number: ");
        int n = scanner.nextInt();
        scanner.close();
        long fibonacciNumber = calculateFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
    }
    public static long calculateFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
