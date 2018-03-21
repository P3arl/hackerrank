import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String s = sc.next();
		sc.close();
		Set<Character> set = new HashSet<>();
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		List<Character> list = new ArrayList<>(set);
		set = null;
		int maxLen = 0;
		if(s.length() == 2) {
			maxLen = 2;
		} else if(s.length() > 2){
			for(int i=0;i<list.size();i++) {
				for(int j=i+1;j<list.size();j++) {
					StringBuilder sb = new StringBuilder();
					for(char c:s.toCharArray()) {
						if(c == list.get(i) || c == list.get(j)) {
							sb.append(c);
						}
					}
					if(stringAlternate(sb.toString())) {
						maxLen = Math.max(maxLen, sb.length());
					}
				}
			}
		}
		System.out.print(maxLen);
	}
    
    private static boolean stringAlternate(String s) {
		for(int i=0,j=2;j<s.length();i++,j++) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
