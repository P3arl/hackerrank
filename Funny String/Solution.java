import java.util.Scanner;

public class Solution {
	static String funnyString(String s){
		for(int i=1,j=s.length()-1;i<s.length();i++,j--) {
        	if(!(Math.abs(s.charAt(i)-s.charAt(i-1)) == Math.abs(s.charAt(j-1)-s.charAt(j)))) {
        		return "Not Funny";
        	}
        }
		return "Funny";
    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
        in.close();
	}
}
