import java.util.Scanner;

public class Solution {

    static int alternatingCharacters(String s){
		char[] arr = s.toCharArray();
		int deletions = 0;
		while (!alternateAB(String.valueOf(arr))) {
			char[] ch = arr;
			int tempLen = 1;
			for (int i = 1; i < ch.length; i++) {
				if(ch[i] == ch[i-1]) {
					ch[i] = '#';
					deletions++;
				} else {
					tempLen++;
				}
			}
			char[] temp = new char[tempLen];
			int j = 0;
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != '#') {
					temp[j++] = ch[i];
				}
			}
			arr = temp;
		}
		return deletions;
    }

    private static boolean alternateAB(String s) {
		char atEven, atOdd;
		if(s.charAt(0) == 'A') {
			atEven = 'A';
			atOdd = 'B';
		} else {
			atEven = 'B';
			atOdd = 'A';
		}
		for (int i = 0,j = 1; j < s.length(); i = i+2,j = j+2) {
			if(s.charAt(i) == atEven && s.charAt(j) == atOdd) {
				continue;
			} else {
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
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
