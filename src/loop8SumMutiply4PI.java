
public class loop8SumMutiply4PI {

	public static void main(String[] args) {
		double sum =0;
		int n = 50000;

		for (int i = 1; i <= n; i+=4) {
			sum +=1.0/i;
		}
		for (int i = 3; i <= n; i+=4) {
			sum -=1.0/i;
		}
		System.out.println(4*sum);
	}

}
