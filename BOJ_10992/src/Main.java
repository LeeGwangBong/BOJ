import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = num - 1; i <= j; j--) {
				System.out.print(" ");
			}
			if (i < num) {
				for (int j = 1; j <= 1; j++) {
					System.out.print("*");
				}
			}
		
			if (i >= 2 && i!=num) {
				for (int j = 1; j <i * 2 - 2; j++) {
					System.out.print(" ");
				}
				for (int j = 1 ; j <= 1; j++) {
					System.out.print("*");
				}
			}
			
			if (i == num) {
				for (int j = 1; j <= num*2-1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();;
		}
	}
}
