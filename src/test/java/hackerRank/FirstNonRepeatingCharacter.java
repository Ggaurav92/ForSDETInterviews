package hackerRank;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		
		String sample = "gibblegabbler";
		
		
		for(int i = 0; i <= sample.length() - 1 ; i++) {
			boolean unique = true;
			
			for(int j = 0; j <= sample.length() - 1 ; j++ ) {
				
				
				if(sample.charAt(i) == sample.charAt(j) && j != i) {
					unique = false;
					
					
				}
			}
			
			if(unique) {
				System.out.println(sample.charAt(i));
				
			}
		}
		
	}

}
