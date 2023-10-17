package ch_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10807 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int val = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) == val) {
                result++;
            }
        }
        System.out.println(result);
        br.close();
    }
}