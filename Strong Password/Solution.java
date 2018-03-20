import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String password = in.next();
    int answer = minimumNumber(n, password);
    System.out.println(answer);
    in.close();
	}

	private static int minimumNumber(int n, String password) {
		int ans = 0;
		if(!password.matches(".*[0-9].*")) {
			ans++;
			password += "0";
		}
		if(!password.matches(".*[a-z].*")) {
			ans++;
			password += "p";
		}
		if(!password.matches(".*[A-Z].*")) {
			ans++;
			password += "P";
		}
		if(!password.matches(".*[!@#$%^&*()\\-+].*")) {
			ans++;
			password += "@";
		}
		n = password.length();
		if(n < 6) {
			for(int i=n;i<6;i++) {
				password += "@";
				ans++;
			}
		}
		return ans;
	}
}
