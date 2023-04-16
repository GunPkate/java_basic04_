import java.util.Scanner;

public class loop5star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int y=n;y>0;y-- ) {
			for (int x = y; x >0; x--) {
				System.out.print("*");				
			}
		System.out.println();
		}
	}
}
