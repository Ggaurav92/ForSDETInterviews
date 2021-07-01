package collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMaps {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		
		map.put(7000,"Tom");
		map.put(2000,"Peter");
		map.put(4000,"Steve");
		map.put(6000,"Naveen");
		map.put(11000,"Robby");
		map.put(1000,"Tom");
		
		System.out.println(map);
		
		System.out.println(map.lastKey());
		System.out.println(map.firstKey());
		
		Set<Integer> keyLessThan3k = map.headMap(4000).keySet();
		System.out.println(keyLessThan3k);
		
		Set<Integer> keyGreater3k = map.tailMap(3000).keySet();
		System.out.println(keyGreater3k);
		
		
	}//End of pvsm

}//End of Class
