import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [] arr = new int [n+1];
		int [] dp = new int[n+1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		//계단이 하나일경우 첫번째 계단
		dp[1] = arr[1];
		
		//두개일 경우 첫번째, 두번째
		if(n >= 2) dp[2] = dp[1] + arr[2];
		
		//3개이상부터 두가지 경우로 나누어 해결 
		//1. n번째 계단과 n-2번째 계단을 밟을 경우
		//2. n번째 계단과 n-1번째 계단 n-3번째 계단을 밟을 경우
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
		}
		
		System.out.println(dp[n]);
		
	}
}
