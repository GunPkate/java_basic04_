
public class loop5tree2 {

	public static void main(String[] args) {

		int n = 10, up, down;
		for (int y = 1; y <= n; y++) {

			for (int x = n - y; x > 0; x--) {
				System.out.print("-");
			}
			up = 0;
			down = y;
			for (int x = 2 * y - 1; x > 0; x--) {
				if (up < y) {
					up++;
					System.out.print(up);
				} else {
					down--;
					System.out.print(down);
				}
			}
//	
			System.out.println();
		}
	}
}
