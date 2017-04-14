import java.util.Scanner;

public class Sample {

	private static void grading(){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int grades[]=new int[n];
		for(int i=0;i<n;i++){
			grades[i]=sc.nextInt();
			int num=grades[i];
			int rem=grades[i]%5;
			if(rem>2)
				if(num+(5-rem)>=40)
					System.out.println(num+(5-rem));
				else
					System.out.println(num);
			else
				System.out.println(num);
		}
		sc.close();
	}
  
  public static void main(String[] args) throws IOException {
		grading();
	}
}
