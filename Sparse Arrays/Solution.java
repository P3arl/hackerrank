import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
        int q = sc.nextInt();
        String[] qStr = new String[q];
        for(int i=0;i<qStr.length;i++) {
			qStr[i]=sc.next();
		}
        sc.close();
        Map<String,Integer> map = new LinkedHashMap<>();
        for(String qs:qStr){
            map.put(qs,0);
            for(String s:str){
                if(qs.equals(s))
                    map.put(qs,map.get(qs)+1);
            }
            System.out.println(map.get(qs));
        }
    }
}
