import java.util.Scanner;

// Time Complexity = O(2^n), Space Complexity = O(n)
public class Binomial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        scanner.close();
        int result = binomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);
    }
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}

