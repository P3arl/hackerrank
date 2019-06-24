/**
Input Format:
The first line contains two space-separated integers n and k, the size of array and the target value. 
The second line contains n space-separated integers of the array.

5 2  
1 5 3 4 2

Use set and add (a[i] - k) into the set and on second iteration check if array contains (a[i] - k) or not.
*/
public class Pairs {

  static int pairs(int k, int[] a) {
        int n = a.length;
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++) {
            if(a[i] > k) {
                set.add(a[i] - k);
            }
        }

        for(int i =0;i<n;i++) {
           if(set.contains(a[i])) {
               count++;
           }
        }
        return count;
    }
}
