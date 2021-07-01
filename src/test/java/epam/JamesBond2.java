package epam;

public class JamesBond2 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,7,0,5,0,6,8,9,2};
		
		System.out.println(isJamesBond(arr));
	}

	private static boolean isJamesBond(int[] A) {
		
		
		try {
			
			for(int i = 0; i < A.length; i++) {
				
				if(A[i] == 0) {
					
					for(int j = i + 1; j < A.length; j++) {
						
						if(A[j] == 0) {
							
							for(int k = j + 1; k < A.length; k++) {
								
								if(A[k] == 7) {
									
									return true;
								}
							}
						
						
					}
					
				}
			}
			
		}
			
		} catch (Exception e) {
			return false;
		}
		
		
		
	return false;
		

}//End of method isjamesBond
	
}//End of class
