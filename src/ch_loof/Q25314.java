package ch_loof;

import java.util.Scanner;

public class Q25314 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();

        for (int i = 0; i < val / 4; i++) {
            System.out.print("long ");
        }

        System.out.print("int");
    }
}
