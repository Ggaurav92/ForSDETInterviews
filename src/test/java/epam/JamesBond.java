package epam;

public class JamesBond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,4,0,0,5,7};
		System.out.println(ifJames(arr));

	}

	private static boolean ifJames(int[] A) {
		
		
		for(int i = 0; i < A.length - 1; i++) {
			
			try {
					
				if(A[i] == 0) {
					
					for(int j = i + 1; j < A.length - 1; j++) {
						
						if(A[j] == 0) {
							
							for(int k = j + 1; j < A.length - 1; k++) {
								
							
								if(A[k] == 7) {
									return true;
								}
							}
						}
						
					}
				}
				
			
				
			} catch (Exception e) {
				return false;
			}
			
		
		
	}//End of for loop

		return false;
	
		
	}

}
