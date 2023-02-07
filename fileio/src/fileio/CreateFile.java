package fileio;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		File f=new File("nitya.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		
		File f1=new File("nitya");
		System.out.println(f1.exists());
		f1.mkdir();
		System.out.println(f1.exists());
	}

}
