package operation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q2588 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val1 = br.readLine(), val2 = br.readLine();
        char[] charArr = val2.toCharArray();
        int[] intArr = new int[charArr.length];

        for (int i = val2.length() - 1; i >= 0; i--) {
            intArr[i] = Integer.parseInt(val1) * Character.getNumericValue(charArr[i]);
            System.out.println(intArr[i]);
        }
        System.out.println(Integer.parseInt(val1) * Integer.parseInt(val2));
    }
}