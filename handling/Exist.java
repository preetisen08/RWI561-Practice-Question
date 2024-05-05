package handling;

import java.io.File;

public class Exist {
	 public static void main(String[]args)throws Exception{
		 File f = new File("D:\\sen\\vinni.txt");
		 if(f.exists()) {
		    System.out.println("file folder is existing");
	 }
	 else
		 System.out.println("file folder is doesnt existing");
		 
}
}
