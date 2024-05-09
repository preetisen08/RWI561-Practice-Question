package HashSet;

import java.util.HashSet;

public class ClearMathod {
	
	public static void main(String[]args) {
		HashSet<String>hs = new HashSet<String>();
		
	    hs.add("Preeti");
	    hs.add("Vinni");
	    hs.add("Krishna");
	    hs.add("Khushi");
	    	    
	    System.out.println(hs);
	    
	    hs.clear();
	    
	    System.out.println(hs);

}
}
