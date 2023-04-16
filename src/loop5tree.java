

public class loop5tree {

	public static void main(String[] args) {

		int n = 10;
		for(int y=1;y<=n;y++ ) {

			for (int x = n-y; x >0; x--) {
				System.out.print("-");				
			}
			
			for (int x = 2*y-1; x >0; x--) {
				System.out.print("x");				
			}
//	
		System.out.println();
		}
	}
}
