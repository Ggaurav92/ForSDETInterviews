package collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMaxProduct {
	
	
	public static void main(String[] args) {
	
		Integer[] product = {10, 11, 13, 9, 2, 4,26,5};
		
	
		System.out.println(findProductMax(product));
	    //System.out.println("Product of min and max element = " + product);

		
	}

	private static int findProductMax(Integer[] product) {
		
		
		Arrays.sort(product, Comparator.reverseOrder());
		
		int maxNumber = product[0];
		System.out.println(maxNumber);
		
		int secondMaxNumber = product[1];
		System.out.println(secondMaxNumber);
		
		return maxNumber * secondMaxNumber;
		
		
	}
	
	
	

}
