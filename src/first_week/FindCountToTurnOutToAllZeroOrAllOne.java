package first_week;

public class FindCountToTurnOutToAllZeroOrAllOne {
    public static int findCountToTurnOutToAllZeroOrAllOne(String str) {
        int allZeroCount = 0;
        int allOneCount = 0;
        char[] array = str.toCharArray();

        if(array[0] == '1') {
            allZeroCount ++;
        } else if(array[0] == '0'){
            allOneCount ++;
        }

        for(int i = 0; i < array.length-1; i++){
            if(array[i] != array[i+1]){
                if(array[i+1] == '1'){
                    allZeroCount++;
                } else {
                    allOneCount++;
                }
            }
        }
        return Math.min(allZeroCount, allOneCount);
    }

    public static void main(String[] args) {
        String input = "011110";
        int result = findCountToTurnOutToAllZeroOrAllOne(input);
        System.out.println(result);
    }
}
