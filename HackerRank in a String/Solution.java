import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int q = in.nextInt();
      for(int a0 = 0; a0 < q; a0++){
          String s = in.next();
          String st = "hackerrank";
          if(s.length()<10) {
             System.out.println("NO");
             break;
          }
          int j=0;
          for(int i=0;i<s.length();i++) {
             if(s.charAt(i)==st.charAt(j)) {
                j++;
                if(j==10)
                   break;
             }
          }
          if(j==st.length()) {
             System.out.println("YES");
          }else {
             System.out.println("NO");
          }
      }
      in.close();
  }
}
