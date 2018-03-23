/*
Used logic as same as checking pallindrome sequence.
*/
import java.util.Scanner;

public class Solution {

    static int theLoveLetterMystery(String s){
		int op = 0;
		for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--) {
			op += Math.abs(s.charAt(i) - s.charAt(j));
		}
		return op;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
