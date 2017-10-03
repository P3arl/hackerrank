import java.util.*;
import java.io.*;

class Solution{
    
    private static int series(int b, int j) {
		int sum = 0;
		int i = 0;
		while(i<=j) {
			sum+= Math.pow(2, i)*b;
			i++;
		}
		return sum;
	}
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int j = 0;j<n;j++){
                System.out.print(a+series(b,j));
                System.out.print(' ');
            }
            System.out.println();
        }
        in.close();
    }
}
