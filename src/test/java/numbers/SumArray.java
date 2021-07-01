package numbers;

public class SumArray {

	public static void main(String[] args) {

		int[] a = {7, 7, 4, 3, 8}; 
		System.out.println(sumArray(a, 7));
		for(int ar: sumArray(a,7)) {
			System.out.println(ar);
		}

	}

	private static int[] sumArray(int[] firstArray, int n) {
		
		int[] sumArray = new int[2];
		
		for (int i = 0; i < firstArray.length; i++) {
			
			for (int j = i + 1; j < firstArray.length; j++) {
				
				if(firstArray[i] + firstArray[j] == n) {
					
					sumArray[0] = firstArray[i];
					
					sumArray[1] = firstArray[j];
				}
				
			}
			
		}
		
		return sumArray;
		
	}

}
