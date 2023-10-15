package ch_loof;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11022 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int val1, val2;

        for (int i = 1; i <= cnt; i++) {
            String[] arr = br.readLine().split(" ");
            val1 = Integer.parseInt(arr[0]);
            val2 = Integer.parseInt(arr[1]);
            bw.write("Case #" + i + ": " + val1 + " + " + val2 + " = " + (val1 + val2) + "\n");
        }
        bw.flush();
        br.close();
    }
}
