import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import javax.imageio.IIOException;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		int [][] arr = new int[n][2];
		String [] str = new String[2];
		
		for(int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);
			arr[i][1] = Integer.parseInt(str[1]);
		}
		
		Arrays.sort(arr,new Comparator<int []>() {
			@Override
			public int compare(int []x,int []y) {
				if(x[0] == y[0]) {
					return Integer.compare(x[1],y[1]);
				}
				return Integer.compare(x[0],y[0]);
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
