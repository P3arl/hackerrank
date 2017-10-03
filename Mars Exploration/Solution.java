import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        int count =0;
        for(int i =0,j=1,k=2;k<S.length();i=i+3,j=j+3,k=k+3) {
        	if(S.charAt(i)!='S') count++;
        	if(S.charAt(j)!='O') count++;
        	if(S.charAt(k)!='S') count++;
        }
        System.out.print(count);
    }
}
