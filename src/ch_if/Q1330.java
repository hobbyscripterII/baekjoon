package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1330 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]);
		String msg = a == b ? "==" : (a > b ? ">" : "<");
		
		System.out.println(msg);
	}
}
