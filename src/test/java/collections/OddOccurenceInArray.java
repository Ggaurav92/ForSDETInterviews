package collections;

public class OddOccurenceInArray {
	
	public static void main(String[] args) {
		
		int[] arr = {9,3,9,3,9,7,9};
		
		System.out.println(findUnpairedNum(arr));
	}

	private static int findUnpairedNum(int[] numbers) {
		
		int unPairedNum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			int checkNum = 0;
			
			int numToCheck = numbers[i];
			
			for(int j = 0; j < numbers.length; j++) {
				
				if(numbers[j] == numToCheck) {
					
					checkNum++;
					
				}
			}
				
				if(checkNum < 2) {
					
					unPairedNum = numToCheck;
						
				}
			
		}
		
		return unPairedNum;
	}
	
}
