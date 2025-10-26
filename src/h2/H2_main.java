package h2;

public class H2_main {
	public static void main(String[] args) {
		int i = 1, j = 2, k = 3, min = 0, max = 0;
		
		if (i <= j & i <= k) {
			min = i;
		} else if(j <= i & j <= k) {
			min = j;
		} else if (k < i & k < j) {
			min = k;
		}
		
		if (i >= j & i >= k) {
			max = i;
		} else if(j >= i & j >= k) {
			max = j;
		} else if (k >= i & k >= j) {
			max = k;
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
