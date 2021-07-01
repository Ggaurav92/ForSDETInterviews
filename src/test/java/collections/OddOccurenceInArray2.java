package collections;

public class OddOccurenceInArray2 {

	public static void main(String[] args) {
		
		
		int[] arr = {9,3,9,3,9,7,9};
		
		System.out.println(findOddOccur(arr));

	}

	private static int findOddOccur(int[] arr) {
		
		int oddOcc = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int a = arr[i];
			
			int num = 0;
			
			for (int j = 0; j < arr.length; j++) {
				
				if(a == arr[j]) {
					
					num++;
				}
			}
			
			if(num < 2) {
				
				oddOcc = arr[i];
			}
			
		}
		
		
		
		
		return oddOcc;
	}

}
