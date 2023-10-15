package ch_loof;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int val1 = s.nextInt();
            int val2 = s.nextInt();

            if (val1 == 0 && val2 == 0) {
                break;
            } else {
                System.out.println(val1 + val2);
            }
        }
    }
}
