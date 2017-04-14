import java.util.Scanner;

public class Solution {

	private static void tallestCandleCount(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ht=new int[n];
		for(int i=0;i<n;i++){
			ht[i]=sc.nextInt();
		}
		int max=ht[0];
		for(int i=1;i<n;i++){
			if(ht[i]>max)
				max=ht[i];
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(max==ht[i])
				count++;
		}
		
		System.out.println("tallest candle count: "+count);
		
	}
  
  public static void main(String[] args) {
		tallestCandleCount();
	}
}
