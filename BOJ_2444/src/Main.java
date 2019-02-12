import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//위에 피라미드
		for(int i = 1; i <= n; i++) {
			
			for(int j = n-1; j >= i; j-- ) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= i ; j++ ) {
				System.out.print("*");
			}
			
			for(int j = 1; j < i ; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		//밑에 피라미드
        for(int i = 1; i < n; i++) {
			
        	for(int j = 1; j <= i ; j++ ) {
 				System.out.print(" ");
 			}
			
        	 for(int j = n-1; j >= i; j-- ) {
				System.out.print("*");
			}
			
        	 for(int j = n-2; j >= i; j-- ) {
 				System.out.print("*");
 			}
					
			System.out.println();
			
        }		
	}
}
