package first_week;

public class StringSummarize {
    public static String summarize_string(String str){
        String result = "";
        int count = 1;

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            } else {
                result += String.valueOf(str.charAt(i)) + count + "/";
                count = 1;
            }
        }
        result += String.valueOf(str.charAt(str.length() -1)) + count;
        return result;
    }

    public static void main(String[] args) {
        String input_str = "acccdeee";

        System.out.println(summarize_string(input_str));
    }
}
