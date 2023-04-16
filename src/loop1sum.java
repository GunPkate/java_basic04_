import java.util.Scanner;

public class loop1sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i =1,total =0;
		
		for(i = 0; i <10; i++) {
			total += sc.nextInt();
//			System.out.println(i+" "+total);
		}
		System.out.println(total);
	}

}
