package HashSet;

import java.util.HashSet;

public class isEmpty {
	public static void main(String[]args) {
		HashSet<String> hs = new HashSet<String>();	
		
		System.out.println(hs.isEmpty());
		
		hs.add("Preeti");
		hs.add("Vinni");
		hs.add("Krishna");
		hs.add("Khushi");
		
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
}
}
