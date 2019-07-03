import java.util.Scanner;

public class Main {
	static int zero;
	static int one;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int [][]arr = new int[41][2];
		
		//[n][0]Àº 0ÀÇ °¹¼ö ,[n][1]Àº 1ÀÇ °¹¼ö
		arr[0][0] = 1;
		arr[1][1] = 1;
		
		for(int i = 2; i < 41; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				arr[i][j] = arr[i-1][j] + arr[i-2][j];
				
			}
		}
		
		for(int i = 0; i < t; i++) {
			
			int a = sc.nextInt();
			System.out.println(arr[a][0]+" "+arr[a][1]);
			
		}		
	}
}
