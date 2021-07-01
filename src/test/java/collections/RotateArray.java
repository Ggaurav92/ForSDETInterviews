package collections;

public class RotateArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = rotateArray(arr,3);
		
		for(int ar:arr2)
			System.out.print(ar);
	}

	private static int[] rotateArray(int[] arr, int n) {
		
		
		for(int i = 0;i < n; i++) {
		int last = arr[arr.length -1];
		
		for(int j = arr.length - 1; j > 0; j--) {
		arr[j] = arr[j - 1];
		}
		arr[0] = last;
		}
	return arr;	
	}

}
