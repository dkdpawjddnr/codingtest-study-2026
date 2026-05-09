package second_week;

public class SequentialTargetNumber {
    public static boolean isExistingTargetNumber(int target, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isExistingTargetNumber(14, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}));
    }
}
