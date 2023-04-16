
public class loop5tree3 {
	public static void main(String[] arg) {
		
		for(int y = 0; y <10; y++) {
			for(int x =y;x < 9; x++) {
				System.out.print("-");
			}
			if(y%2 == 0) {
				for(int z = y*2+1; z>0; z--) {
					System.out.print(z);
				}
			}
			else if(y%1 == 0) {
				for(int z = 0; z<y*2+1; z++) {
					System.out.print(z+1);
				}
			}
			System.out.println();
		}
	}
}
