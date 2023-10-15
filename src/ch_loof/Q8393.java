package ch_loof;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        int reslut = 0;

        for (int i = 1; i <= val; i++) {
            reslut += i;
        }

        System.out.println(reslut);
    }
}
