package handling;

import java.io.File;

public class getAbsolutePath {
	public static void main(String[]args) {
		 File f = new File("D:\\sen");
		 if(f.exists()) {	
            System.out.println("File path = "+f.getAbsolutePath());
		 }else {
			 System.out.println("File does not exist");
			 
			
		}
	}

}
