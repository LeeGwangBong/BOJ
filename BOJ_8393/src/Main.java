import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int result = sum(s.nextInt());
		 System.out.println(result);
	}
	
	private static int sum(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return n + sum(n-1);
		}
		
	}

}
