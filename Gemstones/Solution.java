import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    static int gemstones(String[] arr){
		List<Set<Character>> charSetList = new ArrayList<>();
		for(String s:arr) {
			Set<Character> set = new HashSet<>();
			for(char c:s.toCharArray()) {
				set.add(c);
			}
			charSetList.add(set);
		}
		Set<Character> set0 = charSetList.get(0);
		for (int i = 1; i < charSetList.size(); i++) {
			set0.retainAll(charSetList.get(i));
		}
		return set0.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
