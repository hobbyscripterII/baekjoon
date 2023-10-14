package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1330 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		String msg = " ";
		if(a == b) {
			msg = "==";
		} else {
			msg = a > b ? ">" : "<";
		}
		System.out.println(msg);
	}
}
