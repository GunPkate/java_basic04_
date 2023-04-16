import java.util.Scanner;

public class loop8SumMutiply {

	public static void main(String[] args) {
		long sum =1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int n = 10;
		for (int i = 1; i <= n; i++) {
			sum *=i;
		}
		System.out.println(sum);
	}

}
