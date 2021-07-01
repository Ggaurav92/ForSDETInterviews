package starPattern;

public class Number2Star {

	public static void main(String[] args) {
		
		int a = 5;
		
		int b = 1;
		for(int i = 1; i <= a; i++) {
			
			for(int j = i; j <= a; j++) {
				
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				
				System.out.print(" " + b);
			}
			
			System.out.println();
			b++;
		}
		

	}

}
