package TxtFiles;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;



public class ReadMode {
	
	
	@Test
	public void readtxt() throws IOException{
		File f=new File("C:\\Users\\suresh\\Desktop\\Selenium data Files\\ReadMe.txt");
		
		FileReader fr= new FileReader(f);
		
		BufferedReader br= new BufferedReader(fr);
		
		String x= br.readLine();
		while(x!=null){
		
		System.out.println(x);
		x=br.readLine();
		}
		
		}
	

}
