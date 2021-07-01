package starPattern;

public class NumberStar {

	public static void main(String[] args) {

		int b = 5;
		
		for(int i = 1; i <= b; i++) {
			
			for(int j = 1; j <=i; j++) {
				
				System.out.print(j);
			}
			
			System.out.println("");
		}

	}

}
