package stringQuestions;

public class RemoveZeroes {

	public static void main(String[] args) {
		
		String str = "00000001235469";
		
		str = removeZero(str);
		System.out.println(str);
	}

	private static String removeZero(String str) {
		
		
		
		int i = 0;
		StringBuffer sb = new StringBuffer(str);
		while(i < str.length() && str.charAt(i) == '0') {
			i++;
			
			sb.replace(0,i ,"");
			
			
		}
		
		return sb.toString();
	}
	
	
}//End of Class
