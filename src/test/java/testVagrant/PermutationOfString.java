package testVagrant;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
	
	public static boolean isPermutation(String first,String second) {
		
		boolean flag;
		
		if(first.length() == second.length()) {
			flag = true;
		}else {
			return false;
		}
		
		
		int a = 0;
		
		for(int i = 0; i<= first.length() - 1; i++ ) {
			
			a = a + first.charAt(i);
			//System.out.println(a);
		}
		
		
		for(int i = 0; i <= second.length()-1 ; i++ ) {
			
			a = a - second.charAt(i);
			//System.out.println(a);
		}
		
		if(a == 0) {
			flag = true;
		} else {
			flag = false;
		}
		
		
		return flag;
	}

	public static void main(String[] args) {
		
		System.out.println(isPermutation("Gaurav","aaruvG"));

	}

}
