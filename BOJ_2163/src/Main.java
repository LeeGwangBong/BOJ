import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		sc.close();
		
		// N * M => (���η� N-1�� �ڸ���) + (���η� �ڸ� ���ݸ��� ���η� �ڸ� N��)
		//N-1 + N(M-1) = N + NM - N - 1 = NM - 1
		
		System.out.println((n*m)-1);
	}
}
