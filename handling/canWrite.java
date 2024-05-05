package handling;

import java.io.File;

public class canWrite {
	public static void main(String[]args) {
		 File f = new File("D:\\sen");
		 if(f.exists()) {	
           System.out.println("File Write = "+f.canWrite());
		 }else {
			 System.out.println("File does not exist");
			 
			
		}
	}

}
