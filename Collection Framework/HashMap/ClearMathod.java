package HashMap;

import java.util.HashMap;
import java.util.Map;

public class ClearMathod {
	public static void main(String[]args) {
		Map<Integer, String> map = new HashMap<Integer, String>();	
		map.put(1, "Preeti");
		map.put(2, "Vinni");
		map.put(3, "Krishna");
		map.put(4,"Khushi");
		
		System.out.println(map);
		
	    map.clear();
	    System.out.println(map);
}
}
