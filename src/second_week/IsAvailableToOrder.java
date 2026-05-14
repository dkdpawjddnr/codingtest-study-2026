package second_week;

import java.util.Arrays;

public class IsAvailableToOrder {
    public static boolean isAvailableToOrder(String[] menus, String[] orders){
        Arrays.sort(menus);
        for(String order : orders){
            if(!isExistTargetNumberBinary(menus, order)){
                return false;
            }
        }
        return true;
    }

    public static boolean isExistTargetNumberBinary(String[] menus, String order){
        int min = 0;
        int max = menus.length-1;
        int mid = (max + min) / 2;
        while (min <= max){
            if (menus[mid].equals(order)){
                return true;
            } else if(menus[mid].compareTo(order) < 0){
                min = mid + 1;
            } else {
                max = mid + 1;
            }
            mid = (max + min) / 2;
        }

        return false;
    }

    public static void main(String[] args) {
        String[] shopMenus = {"만두", "떡볶이", "오뎅", "사이다", "콜라"};
        String[] shopOrders = {"오뎅", "콜라", "만두"};

        boolean result = isAvailableToOrder(shopMenus, shopOrders);
        System.out.println(result);
    }
}
