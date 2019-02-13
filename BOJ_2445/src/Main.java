import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			//À§¿¡ »ï°¢Çü
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <=i; j++ ) {
					System.out.print("*");
				}
				for(int j = num*2-1; i*2-1<j; j--) {
					System.out.print(" ");
				}
				for(int j = 1; j <=i; j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			//¹Ø¿¡  »ï°¢Çü
			for(int i = 1; i <= num; i++) {
				for(int j = num; j > i; j-- ) {
					System.out.print("*");
				}
				for(int j = 1; j<=i*2; j++) {
					System.out.print(" ");
				}
				for(int j = num; j > i; j-- ) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
