import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		String inputs = s.next();
		
		s.close();
		
		int sum = 0;
		
		for(int i=0; i<n; i++) {
		
			sum += inputs.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
	
	

}