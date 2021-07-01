package testNg;

import org.testng.annotations.Test;

public class LearnPriority {
	
	
	@Test (priority = -2)
	public void testMinus2(){
		
		System.out.println("testMinus2");
		
	}
	
	@Test (priority = -1)
	public void testMinus1(){
		
		System.out.println("testMinus1");
		
	}
	
	
	@Test (priority = 1)
	public void test1(){
		
		System.out.println("test1");
		
	}
	
	
	@Test 
	public void atest2() {
		
		System.out.println("test2");
	}
	
	
	@Test (priority = 0)
	public void test3() {
		
		System.out.println("test3");
	}
	
	
	@Test (priority = 2)
	public void test4() {
		
		System.out.println("test4");
		
	}
	
}//End of class
