package ch_array;

import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[9];
        int idx = 1;
        int max;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
