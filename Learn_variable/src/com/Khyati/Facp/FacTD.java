package com.Khyati.Facp;

public class FacTD {

	public static void main(String[] args) {
		GetShape ob1=new GetShape();
		
		Shape S1=ob1.getShape("Circle");
		S1.Display();
		
		
		Shape S2=ob1.getShape("Rectangle");
		S2.Display();
		
		
		Shape S3=ob1.getShape("Triangle");
		S3.Display();
		
		
		
	}

}
