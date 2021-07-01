package stringQuestions;

public class IfSubString {

	
	
	private static boolean isSubString(String main, String sub) {

		return main.matches("(.*)" + sub + "(.*)");
		
	}
	
	
	public static boolean isSubString2(String main, String sub) {
		
		return main.contains(sub);
	}
	
public static boolean isSubString3(String main, String sub) {
		
		return main.indexOf(sub) != -1;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(isSubString3("I love Java","Java")); // true
		System.out.println(isSubString3("I love Java","love")); // true
		System.out.println(isSubString3("I love Java","lov")); // true
		System.out.println(isSubString3("I love Java","lo")); // true
		System.out.println(isSubString3("I love Java","I")); // true
		System.out.println(isSubString3("I love Java","Python")); // false
		System.out.println(isSubString3("I love Java"," ")); // true
		System.out.println(isSubString3("I love Java",null)); // false
		System.out.println(isSubString3("I love Java","")); // true
		System.out.println(isSubString3("I love1 Java2","1 ")); //true
		
		
		
		
	}

	
	
}//End of Class
