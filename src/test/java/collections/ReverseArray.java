package collections;

public class ReverseArray {
	
	
	public static void main(String[] args) {
	
		int[] arr1 = {1,2,3,4,5,6,7};
		reverseArray(arr1);
	}

	private static void reverseArray(int[] arr1) {
	
		
		int j = arr1.length - 1; // 6
		
		 
		
		for(int i = 0; i <= arr1.length/2; i++) {
			
			int temp = arr1[i];
			arr1[i] = arr1[j - i];
			arr1[j - i] = temp;
			
		}
		//System.out.println(arr1);
		
		for(int ar:arr1) {
			System.out.print(ar);
		}
	}

}
