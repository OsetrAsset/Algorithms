import java.util.Scanner;

// Time Complexity = O(n!), Space Complexity = O(n)
public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of distinct symbols: ");
        String input = scanner.next();
        scanner.close();
        System.out.println("All permutations of the string:");
        generatePermutations("", input);
    }
    public static void generatePermutations(String prefix, String remaining) {
        if (remaining.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            generatePermutations(prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }
}
