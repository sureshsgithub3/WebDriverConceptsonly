package TxtFiles;

import java.io.FileInputStream;



import org.junit.Test;

public class ReadfromTxtFile {
	
	@Test
   public void readtxtfile(){
	   
	   try {
		FileInputStream fin= new FileInputStream("C:\\Users\\suresh\\Desktop\\Selenium data Files\\ReadMe.txt");
		int i=0;
		while((i=fin.read())!=-1){
			System.out.println((char)i);
		}
		
		
		fin.close();
		
		
	} catch (Exception e) {
		System.out.println(e);
	} 
	   
	  
	   
	   
	   
   }

}
