package com.Khyati.FactoPP;


abstract class Plan {

	 Double Rate;
	 abstract void getRate();
	 
	 public void CalculateBill(float unit) {
		 
		 System.out.println(unit*Rate);
		 
	 }
}
