package HashSet;

import java.util.HashSet;

public class RemoveMathod {
	
		public static void main(String[]args) {
			HashSet<String>hs = new HashSet<String>();
			
		    hs.add("Preeti");
		    hs.add("Vinni");
		    hs.add("Krishna");
		    hs.add("Khushi");
		    	    
		    System.out.println(hs);

		    hs.remove("Krishna");
		    
		    System.out.println(hs);
		    
		    hs.remove("Khushi");
		    
		    System.out.println(hs);
		    
		}

	}

