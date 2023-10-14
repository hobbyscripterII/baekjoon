package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q9498 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		String grade = "F";
		
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		}
		
		System.out.println(grade);
	}
}
