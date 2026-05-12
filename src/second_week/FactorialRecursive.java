package second_week;

public class FactorialRecursive {
    public static int factorial(int number){
        if(number == 1){
            return number;
        }
        return number * factorial(number-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
