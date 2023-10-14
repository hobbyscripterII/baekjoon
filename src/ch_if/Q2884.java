package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2884 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int h = Integer.parseInt(arr[0]), m = Integer.parseInt(arr[1]);
		
		if(h == 0 && m >= 45) {
			m -= 45;
		} else {
			h = h == 0 ? 23 : (h -= 1);
			m = m - 45 < 0 ? m += 60 - 45 : (m -= 45);
		}

		System.out.println(h + " " + m);
	}
}
