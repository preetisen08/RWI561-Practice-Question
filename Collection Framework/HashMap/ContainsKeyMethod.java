package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ContainsKeyMethod {
	public static void main(String[]args) {
		Map<Integer, String> map = new HashMap<Integer, String>();	
		map.put(1, "Preeti");
		map.put(2, "Vinni");
		map.put(3, "Krishna");
		map.put(4,"Khushi");
		
		System.out.println(map);
		
		System.out.println("Key '2' present?"  + map.containsKey(2));
		
		System.out.println("Key '5' present?"  + map.containsKey(5));
		
		
	}
}

