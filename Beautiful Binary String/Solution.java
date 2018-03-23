/*
Its logic is same as previous 'easy' question on hackerrank 'alternating characters'
*/

import java.util.Scanner;

public class Solution {

    static int beautifulBinaryString(String s) {
		char[] ch = s.toCharArray();
		int steps = 0;
		for(int i =2;i<s.length();i++) {
			if(ch[i-2] == '0' && ch[i-1] == '1' && ch[i] == '0') {
				ch[i] = '1';
				steps++;
			}
		}
		return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        int result = beautifulBinaryString(b);
        System.out.println(result);
        in.close();
    }
}
