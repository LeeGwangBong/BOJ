import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		String text = s.nextLine().trim(); //trim()�� �̿��� �������� 
		s.close();
		
		if(text.isEmpty()) {
			System.out.println(0);
		}
		else {
			System.out.println(text.split(" ").length);
		}
		
	}
}
