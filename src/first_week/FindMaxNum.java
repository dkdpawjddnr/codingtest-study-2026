package first_week;

public class FindMaxNum {

    public static int findMaxNum(int[] arr){
        int maxNum = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(maxNum < arr[i]){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        System.out.println("정답 = 6 / 현재 풀이 값 = " + findMaxNum(new int[]{3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = 6 / 현재 풀이 값 = " + findMaxNum(new int[]{6, 6, 6}));
        System.out.println("정답 = 1888 / 현재 풀이 값 = " + findMaxNum(new int[]{6, 9, 2, 7, 1888}));
    }
}
