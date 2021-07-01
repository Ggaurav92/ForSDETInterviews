package starPattern;

public class StringPattern2 {
	
	public static void main(String[] args) {
		
		int a = 5;
		
	
		
		for(int i = 1; i <= a; i++) {
			
			for(int j = a - 1; j >= i; j -- ) {
				
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++ ) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		for(int i = a; i >= 1; i--) {
			
			for(int j = a - 1; j >= i; j -- ) {
				
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++ ) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
	}

}
