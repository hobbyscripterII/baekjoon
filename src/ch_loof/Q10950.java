package ch_loof;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt();
        int val1, val2;

        for (int i = 0; i < cnt; i++) {
            val1 = s.nextInt();
            val2 = s.nextInt();
            System.out.println(val1 + val2);
        }
    }
}
