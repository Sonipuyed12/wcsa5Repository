package locators;
import java.util.Scanner;

public class StringCount  {
		 
		    public static long countStrings(int n) {
		        long[] dp = new long[n + 1];
		        dp[0] = 1;
		        dp[2] = 3;

		        for (int i = 4; i <= n; i += 2) {
		            dp[i] = (dp[i - 2] * 2) % 998244353;
		        }

		        return dp[n];
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();
		        scanner.close();

		        long result = countStrings(n);
		        System.out.println(result);
		    }
		
		
	}


