import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<>();
		
		while(s.hasNextLine()) {
			String input = s.nextLine();
			if(input == null || input.isEmpty()) {
				break;
			}
			inputs.add(input);
		}
		s.close();
		
		for(int i =0; i<inputs.size(); i++) {
			System.out.println(inputs.get(i));
		}
	}
}
