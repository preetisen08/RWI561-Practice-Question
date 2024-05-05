package handling;

import java.io.File;

public class mkdirs {
	public static void main(String[]args)throws Exception{
		 File f = new File("D:\\sen\\abc");
         System.out.println(f.mkdir());
}
}
