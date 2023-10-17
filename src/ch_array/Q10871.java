package ch_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10871 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] con = br.readLine().split(" ");
        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(con[1]) > Integer.parseInt(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
