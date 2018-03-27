import java.util.Scanner;

public class Solution {

    static int palindromeIndex(String s){
		StringBuilder sb = new StringBuilder(s);
		for(int i=0,j=sb.length()-1;i < sb.length()/2;i++, j--) {
			if(sb.charAt(i)!=sb.charAt(j)) {
				StringBuilder temp = new StringBuilder(sb);
				if(stringPallindrome(temp.deleteCharAt(i).toString())) {
					return i;
				} else {
					return j;
				}
			}
		}
		return -1;
    }
    
    private static boolean stringPallindrome(String s) {
		for(int i=0,j=s.length()-1;i < s.length()/2;i++, j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
