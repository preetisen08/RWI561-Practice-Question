package handling;

import java.io.File;

public class canRead {
	public static void main(String[]args) {
		 File f = new File("D:\\sen");
		 if(f.exists()) {	
          System.out.println("File Read = "+f.canRead());
		 }else {
			 System.out.println("File does not exist");
			 
			
		}
	}

}

