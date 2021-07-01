package stringQuestions;

public class IfSubString2 {

	public static void main(String[] args){
		
		System.out.println(isSubString3("I love Java","Java")); // true
		

	}

	private static boolean isSubString3(String main, String sub) {
		
		return main.matches("(.*)" + sub + "(.*)");
	}

}
