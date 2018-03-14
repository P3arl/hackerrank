import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		Stack<Integer> maxSt = new Stack<>();
		while(n-- > 0) {
			int op = sc.nextInt();
			if(op == 1) {
				int x = sc.nextInt();
				if(!maxSt.isEmpty()) {
					if(x >= maxSt.peek()) {
						maxSt.push(x);
					}
				} else {
					maxSt.push(x);
				}
				st.push(x);
			} else if(op == 2) {
				int x = st.pop();
				if(!maxSt.isEmpty()) {
					if(x == maxSt.peek()) {
						maxSt.pop();
					}
				}
			} else if(op == 3) {
				if(!maxSt.isEmpty()) {
					System.out.println(maxSt.peek());
				}
				
			}
		}
		sc.close();
	}
}
