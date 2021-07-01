package hackerRank;

import java.util.Scanner;

public class Tokens {

	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    // Write your code here.
    if (s.length() > 0) {
		String[] tokens = s.split("[!,?._'@\\s]+");
		System.out.println(tokens.length);
		for(String token : tokens) {
			System.out.println(token);
		}
	} else {
		System.out.println(0);
	}
    
    
    scan.close();
	}
}
