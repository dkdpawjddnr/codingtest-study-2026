package second_week;

import java.util.LinkedList;
import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        // 1. 0이 아닌 1부터 N까지 삽입
        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        System.out.print("<");

        int index = 0;
        while(list.size() > 1){
            index = (index + k - 1 ) % list.size();

            // 2. 문자열에 더하지 않고 제거함과 동시에 바로 출력
            System.out.print(list.remove(index) + ", ");
        }

        // 마지막 남은 원소 처리
        System.out.println(list.remove(0) + ">");

        sc.close();
    }
}