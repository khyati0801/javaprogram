package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReader1 {

	

	public static void main(String[] args) throws IOException {
		File f=new File("nitya.txt");
		char[] c=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		//fr.read(c);
//		for(char c1:c) {
//			
//			System.out.print(c1);
//		}
	int n=	fr.read();
	while(!(n==-1)) {
		
		System.out.print((char)n);
		n=fr.read();
		
	}
		fr.close();
	}

}
