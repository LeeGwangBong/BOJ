import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      int n = s.nextInt();
	      s.close();
	      
	      String map[] = new String[n];     //맵에 별모양 저장
	      map[0] ="  *  ";
	      map[1] =" * * ";
	      map[2] ="*****";
	      
	      for(int k = 1; 3*(int)Math.pow(2, k) <=n; ++k) {    //N은 항상 3*Math.pow(2,k)
	    	  star(k,map);
	      }
	      
	      for(int i = 0; i < n; ++i) {
	    	  System.out.println(map[i]);
	      }
	}
	
	private static void star(int k,String map[]) {
		int bottom = 3 * (int)Math.pow(2, k);
		int middle = bottom / 2;
		
		for(int i = middle; i < bottom; i ++) {
			map[i] = map[i-middle]+" "+map[i-middle];
		}
		
		String space="";
		while(space.length()<middle) {
			space+=" ";
		}
		for(int i = 0; i <middle; ++i) {
			map[i] = space + map[i] + space;
		}
	}
	
}
