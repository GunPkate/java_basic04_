import java.util.Scanner;

public class loop2avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i =1,total =0,n=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		double avg=0;
		
		for(i = 1; i <=10; i++) {
			n= sc.nextInt();
			if(n >= max) {
				max = n;
			}
			if(n < min) {
				min = n;
			}
			total += n;
			
//			System.out.println(i+" "+total);
		}
		avg = total/10.0;
		System.out.println(avg);
		System.out.println(min);
		System.out.println(max);

//		System.out.println("avg: "+avg);
//		System.out.println("max: "+max);
//		System.out.println("min: "+min);
	}
}
