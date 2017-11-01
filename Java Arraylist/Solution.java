import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      List<List<Integer>> list = new ArrayList<>(n);
      int i = 0;
      while (n > 0) {
         int d = sc.nextInt();
         list.add(new ArrayList<>());
         while (d > 0) {
            list.get(i).add(sc.nextInt());
            d--;
         }
         i++;
         n--;
      }
      int q = sc.nextInt();
      while (q > 0) {
         int x = sc.nextInt();
         int y = sc.nextInt();
         try {
            System.out.println(list.get(x - 1).get(y - 1));
         } catch (IndexOutOfBoundsException ex) {
            System.out.println("ERROR!");
         }
         q--;
      }
      sc.close();
   }
}
