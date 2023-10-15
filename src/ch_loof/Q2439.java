package ch_loof;

import java.util.Scanner;

public class Q2439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();

        for (int i = 1; i <= val; i++) {
            for (int k = val; i < k; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
