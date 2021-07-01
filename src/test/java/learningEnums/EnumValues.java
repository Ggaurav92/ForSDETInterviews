package learningEnums;

public class EnumValues {

	public static void main(String[] args) {
		
		Direction[] direction = Direction.values();
		
		for(Direction d : direction) {
			System.out.println(d);
		}
		
		Direction east = Direction.valueOf("EAST");
		
		System.out.println(east);
	}
	
}//End of Class
