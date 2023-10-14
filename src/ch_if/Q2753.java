package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2753 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int years = Integer.parseInt(br.readLine());
		
		System.out.println(years % 4 == 0 && years % 100 != 0 || years % 400 == 0 ? "1" : "0");
	}
}
