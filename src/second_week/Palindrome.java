package second_week;

public class Palindrome {

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1 -i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "소주만병만주소";

        System.out.println(isPalindrome(input));
    }
}
