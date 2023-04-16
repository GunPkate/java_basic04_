import java.util.Scanner;

public class loop5compare {

	public static void main(String[] args) {
		double a = 50,b=70;
		int x = 0;
		int year = 1;
		String result = "";
		while(true) {
			a = a*1.03;
			b = b*1.02;
			result = String.format("Year %s A: %.2f  B: %.2f", year, a,b);
//			System.out.println(result);
			if(a > b)break;
			year++;
		}

		System.out.println(year);
		
	}

}
