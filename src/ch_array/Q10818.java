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
        int min = 0, max = 0;

        for (int i = 1; i < arr.length; i++) {
            min = Integer.parseInt(arr[i]);
            max = Integer.parseInt(arr[i]);

            if (arr.length > arr.length - 1) {
                if (min > Integer.parseInt(arr[i])) {
                    min = Integer.parseInt(arr[i]);
                }
                if (max < Integer.parseInt(arr[i])) {
                    max = Integer.parseInt(arr[i]);
                }
            }
        }

        bw.write(min + "\n");
        bw.write(max + "\n");
        bw.close();
        br.close();
    }
}
