package ch_loof;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int price = s.nextInt(), num = s.nextInt();
        int[] obj = new int[num];
        int money, result = 0;

        for (int i = 0; i < obj.length; i++) {
            money = s.nextInt();
            num = s.nextInt();
            obj[i] = money * num;
            result += obj[i];
        }

        String msg = price == result ? "Yes" : "No";

        System.out.println(msg);
    }
}
