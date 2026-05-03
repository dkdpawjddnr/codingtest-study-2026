package first_week;

public class FindMaxOccurredAlphabet {

    public static char findMaxOccurredAlphabet(String string){
        int[] alphaArray = new int[26];

        for(char c : string.toCharArray()){
            if(Character.isLetter(c)){
                alphaArray[c - 'a']++;
            }
        }

        int index = 0;
        int maxCount = 0;

        for(int i = 0; i < alphaArray.length; i++){
            if(alphaArray[i] > maxCount){
                index = i;
                maxCount = alphaArray[i];
            }
        }

        return (char)(index + 'a');
    }

    public static void main(String[] args) {
        System.out.println("정답 = i 현재 풀이 값 = " + findMaxOccurredAlphabet("hello my name is dingcodingco"));
        System.out.println("정답 = e 현재 풀이 값 = " + findMaxOccurredAlphabet("we love algorithm"));
        System.out.println("정답 = b 현재 풀이 값 = " + findMaxOccurredAlphabet("best of best youtube"));
    }
}
