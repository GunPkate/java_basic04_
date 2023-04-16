import java.util.Scanner;

public class loop9PosiNega2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i,sum = 0, count = 0;
		double avg;
		
		while(true) { // for(;;)
			if(count ==0) {
				System.out.println("No avg");
			}
			else {				
				System.out.println("Input positve");
				i = sc.nextInt();
				if(i < 0) {				
					System.out.print("Error");
				}
				if(i >=0) {
					sum += i;
				}
				if(i == 0) {
					avg = sum/count;
					System.out.println(avg);
					System.out.println(sum);
					break;
				}
			}
			count++;
		}
	}

}
