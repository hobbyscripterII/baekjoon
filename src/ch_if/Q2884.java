package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int h = Integer.parseInt(arr[0]), m = Integer.parseInt(arr[1]);

        // 1: if문
        if(m >= 45) {
            m -= 45;
        } else {
            h = h != 0 ? --h : 23;
            m += 60 - 45;
        }

        // 2: 삼항 연산자
        h = m >= 45 ? h : (h == 0 ? 23 : --h);
        m = m >= 45 ? (m - 45) : (m + 60 - 45);

        System.out.println(h + " " + m);
    }
}
