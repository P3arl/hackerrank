import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int q = sc.nextInt();
		List<List<Integer>> seqList = new ArrayList<>(n);
		for(int i=0;i<n;i++) {
			seqList.add(new ArrayList<>());
		}
		int lastAnswer = 0;
		while(q-- > 0) {
			int op = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int i = 0;
			if(op == 1) {
				int seqIdx = (x^lastAnswer)%n;
				seqList.get(seqIdx).add(y);
			} else if(op == 2) {
				int seqIdx = (x^lastAnswer)%n;
				int size = seqList.get(seqIdx).size();
				int pos = y%size;
				int value = seqList.get(seqIdx).get(pos);
				lastAnswer = value;
				System.out.println(lastAnswer);
			}
		}
		sc.close();
    }
}
