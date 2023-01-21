package javaPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileNotFoundExceptionClass {

	public static void main(String[] args) throws IOException {
		

		try {
	      
	          File f=new File("file.txt");   
	            
	          
	        PrintWriter p1=new PrintWriter(new FileWriter(f), true);
	            
	         
	        p1.println("Hello world");
	          p1.close();
	        
	         
	        f.setReadOnly();
	        
	          
	          PrintWriter p2=new PrintWriter(new FileWriter("fileData.txt"), true);
	        p2.println("Hello World");
	    }
	      
	    
	    catch(FileNotFoundException ex) {
	       System.out.println("File Not Found "+ex.getMessage());
	    }
	}

}
