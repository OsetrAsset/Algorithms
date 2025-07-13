import java.util.Scanner;

// Time Complexity = O(n), Space Complexity = O(n)
public class Minimum {
    public static int Min(int[] a, int n) {
        if (n == 1) {
            return a[0];
        }
        return Math.min(a[n - 1], Min(a, n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements do you want?");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Enter them");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int min = Min(a, n);
        System.out.println("Minimum element: " + min);
        scanner.close();
    }
}
