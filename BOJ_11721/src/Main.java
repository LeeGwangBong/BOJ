import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String input = s.next();	
		
		s.close();
		
		for(int i = 0; i<input.length(); i++) {
			System.out.print(input.charAt(i));
			if(i % 10 == 9) {
				System.out.println();        //0 ~ 9 10글자씩 개행
			}
		}
		
	}
}
