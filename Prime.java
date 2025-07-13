import java.util.Scanner;

// Time Complexity = O(sqrt(n)), Space Complexity = O(sqrt(n))
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = scanner.nextInt();
        scanner.close();
        boolean isPrime = checkPrime(n, 2);
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
    public static boolean checkPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor > Math.sqrt(n)) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return checkPrime(n, divisor + 1);
    }
}
