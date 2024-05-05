package handling;
import java.io.*;

public class RenameFile {
		 public static void main(String[]args)throws Exception{
			 File f1 = new File("D:\\sen\\preeti.txt");
			 File f2 = new File("D:\\sen\\vinni.txt");
			 
			 System.out.println(f1.renameTo(f2));
			 
		 }
}
