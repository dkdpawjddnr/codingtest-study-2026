package first_week;

public class FindMaxPlusOrMultiply {
    private static int findMaxPlusOrMultiply(int[] arr) {
        int sumNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1 || sumNumber <= 1) {
                sumNumber += arr[i];
            } else {
                sumNumber *= arr[i];
            }
        } return sumNumber;
     }



    public static void main(String[] args) {
        System.out.println("정답 = 728 현재 풀이 값 = " + findMaxPlusOrMultiply(new int[]{0, 3, 5, 6, 1, 2, 4}));
        System.out.println("정답 = 8820 현재 풀이 값 = " + findMaxPlusOrMultiply(new int[]{3, 2, 1, 5, 9, 7, 4}));
        System.out.println("정답 = 270 현재 풀이 값 = " + findMaxPlusOrMultiply(new int[]{1, 1, 1, 3, 3, 2, 5}));
    }
}
