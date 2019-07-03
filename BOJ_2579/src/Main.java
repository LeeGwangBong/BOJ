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
		
		//����� �ϳ��ϰ�� ù��° ���
		dp[1] = arr[1];
		
		//�ΰ��� ��� ù��°, �ι�°
		if(n >= 2) dp[2] = dp[1] + arr[2];
		
		//3���̻���� �ΰ��� ���� ������ �ذ� 
		//1. n��° ��ܰ� n-2��° ����� ���� ���
		//2. n��° ��ܰ� n-1��° ��� n-3��° ����� ���� ���
		for(int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]);
		}
		
		System.out.println(dp[n]);
		
	}
}
