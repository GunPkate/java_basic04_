import java.util.Scanner;

public class loop3avg_n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i =1,total =0,n,k=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		double avg=0;
//		System.out.println("Input n: ");
		n=sc.nextInt();
		for(i = 1; i <=n; i++) {
//			System.out.println("Input k: ");
			k= sc.nextInt();
			if(k >= max) {
				max = k;
			}
			if(k < min) {
				min = k;
			}
			total += k;
			
//			System.out.println(i+" "+total);
		}
		avg = (double)total/n;
		System.out.println(avg);
		System.out.println(min);
		System.out.println(max);
	}
}
