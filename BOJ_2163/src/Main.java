import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		// N * M => (가로로 N-1번 자르고) + (가로로 자른 초콜릿을 세로로 자른 N개)
		//N-1 + N(M-1) = N + NM - N - 1 = NM - 1
		
		System.out.println((n*m)-1);
	}
}
