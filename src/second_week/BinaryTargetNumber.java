package second_week;

public class BinaryTargetNumber {
    public static boolean isExistingTargetNumberBinary(int target, int[] array) {
        int min = 0;
        int max = array.length - 1;
        int mid = (min + max) / 2;
        int count = 0;

        while(min <= max){
            count ++;
            if(array[mid] == target){
                System.out.println("count = " + count);
                return true;
            }else if(target > array[mid]){
                min = mid + 1;
            }else if(target < array[mid]){
                max = mid - 1;
            }
            mid = (max + min) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        int findingTarget = 14;
        int[] findingNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        boolean result = isExistingTargetNumberBinary(findingTarget, findingNumbers);
        System.out.println(result);
    }
}
