import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num*2-1; i++) {
			if(i<=num) {
				
				for(int j = num; i<j; j--) {
					System.out.print(" ");
				}
				
				for(int j = 1; j <= i; j++) {
					System.out.print("*");					
				}
				
			}
		else {		
			
			for(int j = 1; j <= i-num; j++) {
				System.out.print(" ");					
			}
			
			for(int j = num-1; i-num<=j; j--) {
				System.out.print("*");
			}
			
		}
			System.out.println();
		}
	}
}
