package khyati.As;

import java.util.Scanner;

abstract class Emp{
	abstract void print();
	
}
class EmpD extends Emp{
	void print() {
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Name:");
		String EmpName=sc.next();
		
		System.out.println("Enter age:");
		int age=sc.nextInt();
		
		System.out.println("Enter salary:");
		float salary=sc.nextFloat();
		
		
		System.out.println("Name:"+EmpName);
		System.out.println("Age:"+age);
		System.out.println("salary:"+salary);
		
		
		
		
	}
	
	
	
}
public class Employee {

	public static void main(String[] args) {
		EmpD ob=new EmpD();
		ob.print();
	}

}
