package collections;

public class SecondLargestInArray2 {

	public static void main(String[] args) {
		
		
		int[] arr = { 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		
		
		int largest = arr[0];
		
		int secondlargest = arr[0];
		
		
		for (int i = 0; i < arr.length - 1 ; i++) {
			
			if(arr[i] > largest) {
				
				secondlargest = largest;
				
				largest = arr[i];
				
			}else if (arr[i] > secondlargest && arr[i] != largest) {
				
				
				secondlargest = arr[i];
				
				
			}
			
			
		}

		
		System.out.println(secondlargest);
		
	}

}
