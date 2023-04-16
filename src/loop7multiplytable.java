
public class loop7multiplytable {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 0) {
				System.out.print("*"+"|\t");
			}else {				
				System.out.print(i+"|\t");
			}
			for (int j = 1; j < 10; j++) {
				if (i == 0) {
					if(j < 9) System.out.print(j+"\t");
					if(j == 9 )System.out.print(j);
				} 
				else {
					if(j < 9) System.out.print(i*j+"\t");
					if(j == 9 )System.out.print(i*j);
				}
			}
			System.out.println();
			if (i == 0) {
				for (int x = 0; x < 77; x++) {
					System.out.print("-");					
				}			
				System.out.println();	
			}
		}
	}

}
