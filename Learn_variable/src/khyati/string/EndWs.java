package khyati.string;

public class EndWs {

	
		 public static void main(String[] args) {  
			 String str = "Welcome to JavaTpoint";  
			  
			// prints true  
			System.out.println(str.endsWith(""));  
			  
			// prints false as there is no white space after the string  
			System.out.println(str.endsWith(" "));  
			  
			}  

	}


