package khyati.string;
class getName{
	
	 final int i;
	getName(int i){
	this.i=i;
	
	}
	
	
	int getI() {
		
		return i;
	}
	
	
	
}

public class StringFinal {

	public static void main(String[] args) {
		getName ob1=new getName(10);
		System.out.println(ob1.getI());
		
		ob1.getI();
		String s1="Khyati";
		s1.concat("patel");
		
		
		String s2=new String("Khyati");
		s2.concat("patel");
		
		
		StringBuilder s3=new StringBuilder("Khyati");
		s3.append("patel");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		//System.out.println(s1.concat(s2));
		

	}

}
