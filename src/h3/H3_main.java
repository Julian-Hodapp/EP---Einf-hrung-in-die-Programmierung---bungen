package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 140, j = 150, k;
		
		boolean a1 = i > j, a2 = i > 200, a3 = j > 100;
		
		k = -10;
		
		if (a1 & a2 == false & a3 == false) {
			k = 1;
		} else if(a1 & a2 & a3 == false) {
			k = 2;
		} else if(a1 & a2 & a3) {
			k = 3;
		} else if(a1 == false & a2 == false & a3 == false) {
			k = 4;
		}
		
		System.out.println(k);
	}
}
