import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] num = new int[3];
		
		for(int i = 0; i<3; i++) {
			num[i]=sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(num);              //sort를 이용하여 오름차순으로 정렬함
		System.out.println(num[1]);
	}
}
