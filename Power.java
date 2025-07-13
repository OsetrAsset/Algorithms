import java.util.Scanner;

// Time Complexity = O(n), Space Complexity = O(n)
public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        scanner.close();
        long result = calculatePower(a, n);
        System.out.println(a + " to the power of " + n + " is: " + result);
    }
    public static long calculatePower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * calculatePower(a, n - 1);
    }
}

