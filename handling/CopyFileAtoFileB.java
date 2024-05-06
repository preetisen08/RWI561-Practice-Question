    package handling;
	import java.io.*; 
	
	public class CopyFileAtoFileB {
		public static void main(String[]args)throws Exception{
	        FileInputStream inputStream = new FileInputStream("C:\\Users\\preet\\OneDrive\\Desktop\\Preeti sen.txt");  
	        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\preet\\OneDrive\\Desktop\\Ashish sir.txt");    
	           
	        int i;   
	            while ((i = inputStream.read()) != -1) {  
	            	{
	            		outputStream.write((char)i);
	            	}
	           // System.out.println("Data copied Successfully:");  
	        }  
		System.out.println("Data copied Successfully:");  
		}
	}