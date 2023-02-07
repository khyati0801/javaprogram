package com.Khyati.FactoPP;

public class GetFactoryPlan {
	
	public Plan GetPlan(String PlanType) {
		
		
		if(PlanType==null) {
			return null;
		}
		else if(PlanType.equalsIgnoreCase("Domestic")) {
			return new Domestic();
			
		}
		else if(PlanType.equalsIgnoreCase("Commercial")) {
			
			return new Comercial();
		}
      else if(PlanType.equalsIgnoreCase("Industrial")) {
			
			return new Industrial();
		}
		
		
		return null;
		
		
		
		
		
	}

}
