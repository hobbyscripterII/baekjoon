package ch_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10818 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int min = Integer.parseInt(arr[0]), max = Integer.parseInt(arr[0]);

        for (int j = 1; j < arr.length; j++) {
            if (min > Integer.parseInt(arr[j])) {
                min = Integer.parseInt(arr[j]);
            }
            if (max < Integer.parseInt(arr[j])) {
                max = Integer.parseInt(arr[j]);
            }
        }

        bw.write(min + "\n");
        bw.write(max + "\n");
        bw.close();
        br.close();
    }
}
