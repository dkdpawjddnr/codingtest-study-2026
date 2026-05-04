package first_week;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeListUnderNumber {

    public static List<Integer> findPrimeListUnderNumber(int number) {
        List<Integer> result = new ArrayList<>();

        for(int i = 2; i <= number; i++){
            boolean isPrime = true;
            for(int num : result){
                if(num * num <= i && i % num == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                result.add(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int input = 20;
        List<Integer> result = findPrimeListUnderNumber(input);
        System.out.println(result);
    }
}
