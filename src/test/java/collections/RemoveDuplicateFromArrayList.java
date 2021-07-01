package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,2,1,4,5,6,1,7,8,9));
		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		List<Integer> numbersWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numbersWithoutDuplicates);
		
		
		
	}

}
