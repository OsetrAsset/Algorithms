import java.util.Scanner;

// Time Complexity = O(n), Space Complexity = O(n)
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        double average = calculateAverage(arr, n);
        System.out.println("Average: " + average);
    }
    public static double calculateAverage(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return ((calculateAverage(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
    }
}
