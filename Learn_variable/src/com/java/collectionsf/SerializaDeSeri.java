package com.java.collectionsf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializaDeSeri {

	public static void main(String[] args) {
ArrayList<String> Al=new ArrayList<String>();
		
		Al.add("pen");
		Al.add("eraser");
		Al.add("ballpen");
		Al.add("sharpner");
		Al.add("scale");
		
		
		try {
			
			
			
			FileOutputStream fos=new FileOutputStream("file");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(Al);
			fos.close();
			oos.close();
			
			
			  FileInputStream fis=new FileInputStream("file");  
              ObjectInputStream ois=new ObjectInputStream(fis); 
              
              ArrayList  list=(ArrayList)ois.readObject();  
            		  
            		  System.out.println(list);
            		  fis.close();
            		  ois.close();
              
		}
		catch(Exception e) {
			
			
			System.out.println(e);
		
			
		}

	}

}
