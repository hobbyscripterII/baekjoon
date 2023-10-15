package ch_if;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2480 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int dice1 = Integer.parseInt(arr[0]), dice2 = Integer.parseInt(arr[1]), dice3 = Integer.parseInt(arr[2]);
        int temp = 0, money = 0;

        if (dice1 == dice2) {
            temp = dice1;
        } else if (dice2 == dice3) {
            temp = dice2;
        } else if (dice3 == dice1) {
            temp = dice3;
        }

        if (dice1 == dice2 && dice2 == dice3 && dice3 == dice1) {
            money = 10000 + temp * 1000;
        } else if (dice1 == dice2 || dice2 == dice3 || dice3 == dice1) {
            money = 1000 + temp * 100;
        } else {
            temp = dice1 > dice2 ? (dice1 > dice3 ? dice1 : dice3) : (dice2 > dice3 ? dice2 : dice3);
            money = temp * 100;
        }

        System.out.println(money);
    }
}
