package handling;

import java.io.File;

public class DeleteFile {
	 public static void main(String[]args)throws Exception{
		   File f = new File("D:\\sen\\preeti.txt");
		   System.out.println(f.delete());
	 }
}
