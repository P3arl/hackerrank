import java.util.Scanner;

public class Solution {

    static int anagram(String s){
		if(s.length()%2 == 0) {
			int[] chars = new int[26];
			
			for(int i=0;i<s.length()/2;i++) {
				chars[s.charAt(i)-'a'] = ++chars[s.charAt(i)-'a']; 
			}
			for(int i=s.length()/2;i<s.length();i++) {
				if(chars[s.charAt(i)-'a'] != 0) {
					chars[s.charAt(i)-'a']--;
				}
			}
			int changes = 0;
			for(int i=0;i<26;i++) {
				changes += chars[i];
			}
			return changes;
		} else {
			return -1;
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
