package ch_operation;

import java.util.Scanner;

public class Q11382 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long[] val = new long[3];
        long result = 0;

        for (int i = 0; i < val.length; i++) {
            val[i] = s.nextLong();
            result += val[i];
        }

        System.out.println(result);
    }
}