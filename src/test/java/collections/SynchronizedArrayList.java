package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
	
	
	//The thread safe version of ArrayList is copyOnWriteArrayList
	
	public static void main(String[] args) {
		
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		
		namesList.add("Java");
		namesList.add("C#");
		namesList.add("Python");
		namesList.add("Java Script");
		namesList.add("Visual Basic");
		
		List<String> addressList = new ArrayList<String>();
		
		addressList.add("Delhi");
		addressList.add("Mumbai");
		addressList.add("Chennai");
		addressList.add("Kolkata");
		addressList.add("Pune");
		
		
		//add, remove - we dont need explicit synchronization
		
		//to fetch/traverse the values from list -- we have to use explicit synchronization
		
		synchronized(addressList) {
			
			
			Iterator<String> it = addressList.iterator();
			
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
		}
		
		
		
		// 2. copyOnWriteArrayList -- its a class:
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		
		empList.add("Gaurav");
		empList.add("Abhishek");
		empList.add("Vishnu");
		empList.add("Sarfaraz");
		
		//we dont need explicit synchronization for any operation: add/remove/traverse
		
		
	
	}

}
