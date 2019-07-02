import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		//DynamicPrograming
		int []arr = new int[11];
		int t,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		t = Integer.parseInt(br.readLine());
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			for(int j = 4; j <= n; j++) {
				arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
			}
			System.out.println(arr[n]);
		}
		
		br.close();
	}
}
