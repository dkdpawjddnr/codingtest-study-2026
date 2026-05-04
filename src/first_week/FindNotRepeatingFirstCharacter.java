package first_week;

public class FindNotRepeatingFirstCharacter {
    public static char findNotRepeatingFirstCharacter(String str) {
        char[] array = str.toLowerCase().toCharArray();
        int[] countAlphabet = findOccurredAlphabet(array);

        for(char c : array){
            int index = c - 'a';

            if(countAlphabet[index] == 1){
                return c;
            }
        }
        return '_';
    }

    public static int[] findOccurredAlphabet(char[] arr){
        int[] countAlphabet = new int[26];

        for(char c : arr){
            int index = c - 'a';

            if(Character.isLetter(c)){
                countAlphabet[index]++;
            }
        }

        return countAlphabet;
    }



    public static void main(String[] args) {
        System.out.println("정답 = d 현재 풀이 값 = " + findNotRepeatingFirstCharacter("abadabac"));
        System.out.println("정답 = c 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aabbcddd"));
        System.out.println("정답 = _ 현재 풀이 값 = " + findNotRepeatingFirstCharacter("aaaaaaaa"));
    }
}
