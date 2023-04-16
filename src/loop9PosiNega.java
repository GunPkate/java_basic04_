import java.util.Scanner;

public class loop9PosiNega {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,sum = 0, count = 0;
		double avg;
		
		for(;;) {
			i = sc.nextInt();
			if (i ==0) {
				break;
			} else {
				sum += i;
				System.out.println(sum);
				System.out.println(count);
				count++;
			}
		}
		avg = (double) sum/count;
		System.out.println(avg);
	}
}
