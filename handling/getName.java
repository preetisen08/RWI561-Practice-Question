package handling;
import java.io.*;

public class getName {
	public static void main(String[]args) {
		 File f = new File("D:\\sen");
		 if(f.exists()) {	
             System.out.println("File Name = "+f.getName());
		 }else {
			 System.out.println("File does not exist");
			 
			
		}
	}

}
