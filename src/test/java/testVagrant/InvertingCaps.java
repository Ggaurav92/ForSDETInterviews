package testVagrant;

public class InvertingCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Bangalore is capital of Karnataka";
		
		String[] strArray = str.split(" ");
		
		String finalStr = "";
		
		for (int i = 0; i < strArray.length; i++) {
			
			char first = strArray[i].charAt(0);
				
			String second = ""; 
			
			for (int j = strArray[i].length() - 1 ; j >= 1 ; j--) {
				
				second = second + Character.toString(strArray[i].charAt(j));
			}
			
			if(finalStr.equals("")) {
				finalStr = finalStr + Character.toString(first).toUpperCase() + second;
			} else {
			finalStr = finalStr + " " + Character.toString(first).toUpperCase() + second;
			}
		}
		
		System.out.println(finalStr);
		
		
	}

}
