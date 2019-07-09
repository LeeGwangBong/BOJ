import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {			
				if(i == t-1) {
					
					for(int j = 0; j < t*2-1; j++) {
					System.out.print("*");
					
					}			
				}
				
				else if(i < t-1) {
					
					for(int j = i+1; j < t; j++) {
						System.out.printf(" ");
						
					}
					
					for(int j = 0; j < 1; j++) {
						System.out.printf("*");
					}
					
					for(int j = 0; j < (i*2)-1; j++) {
						System.out.printf(" ");
					}

				}
				
				if(i > 0 && i < t-1 ) {
					for(int j = 0; j < 1; j++) {
						System.out.printf("*");
					}
				}	
			System.out.println("");
		}
			
	}
}

