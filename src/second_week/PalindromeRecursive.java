package second_week;

public class PalindromeRecursive {

    public static boolean isPalindrome(String str) {
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        if (str.length() <= 1) {
            return true;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String input = "abcba";
        System.out.println(isPalindrome(input));
    }
}
