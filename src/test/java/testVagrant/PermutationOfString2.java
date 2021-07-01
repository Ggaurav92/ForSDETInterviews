package testVagrant;

public class PermutationOfString2 {

	public static void main(String[] args) {
		
		
		
		System.out.println(isPermutation("Gaurav","Garauv"));
	}

	private static boolean isPermutation(String first, String second) {
		
		
		
		
		if(first.length() != second.length()) {
			return false;
		}
		
		int total = 0;
		
		for(int i = 0; i < first.length(); i++) {
			
			
			total = total + first.charAt(i);	
			
		}
		
		for(int i = 0; i < second.length(); i++) {
			
			
			
			total = total - second.charAt(i);	
		}
		
		
		if(total == 0) {
			return true;
		}else {
			return false;
		}
		
	}

}
