import java.util.Scanner;

// Time Complexity = O(log(min(a,b)), Space Complexity = O(log(min(a,b)))
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();
        scanner.close();
        int result = gcd(a, b);
        System.out.println("GCD(" + a + ", " + b + ") = " + result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}

