package hackerRank;

import java.util.Scanner;

public class FindIfPalindrome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean Ispalindrome = true;
        for(int i = 0; i <= A.length()/2; i++) {
        	
        //System.out.println(A.length()/2);
        	if(A.charAt(i) != A.charAt(A.length() - i -1)) {
        		Ispalindrome = false;
        	} 
        }
        
        if(Ispalindrome) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
        
	}
	
}
