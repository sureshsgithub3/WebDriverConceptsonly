package TxtFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;

public class WriteTO_TextFiles {
	@Test
	public void writeto(){
	
	try{
		FileOutputStream fout= new FileOutputStream("C:\\Users\\suresh\\Desktop\\Selenium data Files\\WriteMe.txt");
		
		String s="selenium";
		byte b[]=s.getBytes();
		fout.write(b);
		fout.close();
	}catch(Exception e){
		System.out.println(e);
	}

}
}