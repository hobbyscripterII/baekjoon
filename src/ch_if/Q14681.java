package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q14681 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
		int quadrant = 0;
		
		if(x > 0 && y > 0) {
			quadrant = 1;
		} else if(x > 0 && y < 0) {
			quadrant = 4;
		} else if(x < 0 && y > 0) {
			quadrant = 2;
		} else {
			quadrant = 3;
		}
		
		System.out.println(quadrant);
	}
}
