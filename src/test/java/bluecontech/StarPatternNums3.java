package bluecontech;

public class StarPatternNums3 {
	
	public static void main(String[] args){
		
		
		int a = 5; 
		
		for (int i = 0; i < a; i++) {
			
			
			for (int j = a; j >= i ; j--) {
				
				System.out.print(" ");
				
			}
			
			for (int k = 0; k <= i; k++) {
				
				System.out.print(" *");
				
			}
			
			
			System.out.println();
			
		}
		
	}

}
