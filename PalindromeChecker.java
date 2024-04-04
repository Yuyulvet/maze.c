import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println("input:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() > 1000) {
            System.out.println("error format");
        } else {
            StringBuilder temp = new StringBuilder(s);
            temp.reverse();
            String newtemp = new String(temp);
            if (s.equals(newtemp)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
}