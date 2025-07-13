import java.util.Scanner;

// Time Complexity = O(n), Space Complexity = O(n)
public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.next();
        scanner.close();
        boolean isAllDigits = checkAllDigits(s, 0);
        if (isAllDigits) {
            System.out.println("The string consists of all digits.");
        } else {
            System.out.println("The string contains non-digit characters.");
        }
    }

    public static boolean checkAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }
        return checkAllDigits(s, index + 1);
    }
}

