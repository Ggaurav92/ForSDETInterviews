package stringQuestions;

public class EquilibriumIndex {

	public static void main(String[] args) {
		
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
        int arr_size = arr.length;
        System.out.println("First equilibrium index is " + equilibrium(arr, arr_size));

	}

	private static int equilibrium(int[] arr, int n) {
		
		int sum = 0; //Sum of the whole array
		int leftsum = 0; //Sum of the left side
		
		//find sum of whole array
		for(int i = 0; i < n; i++)
			sum = sum + arr[i];
		
			
			
		
			System.out.println("Value of sum after first loop is " + sum);
		
		for(int i = 0; i < n; i++) {
			sum = sum - arr[i];
			
			System.out.println("Value of sum after inner loop is " + sum);
			
			if(leftsum == sum) {
				return i;
			}
			
			
			leftsum = leftsum + arr[i];
			System.out.println("The value of leftSum is  " + leftsum);
		}
		
		return -1;
		
	}

}
