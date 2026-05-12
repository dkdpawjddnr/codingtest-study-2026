package second_week;

public class CountdownRecursive {

    public static void countdown(int number){
        if (number < 0){
            return;
        }
        System.out.println(number);
        countdown(number - 1);
    }

    public static void main(String[] args) {
        countdown(60);
    }
}
