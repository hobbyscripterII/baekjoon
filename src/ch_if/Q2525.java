package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2525 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int h = Integer.parseInt(arr[0]), m = Integer.parseInt(arr[1]);
        int time = Integer.parseInt(br.readLine());

        m += time;
        if (m / 60 >= 1) {
            h += m / 60;
            m = m - (60 * (m / 60));
        }

        h = h == 24 ? 0 : (h > 24 ? h - 24 : h);

        System.out.printf("%d %d", h, m);
    }
}
