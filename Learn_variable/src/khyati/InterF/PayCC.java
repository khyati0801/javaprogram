package khyati.InterF;
interface Payment{
	
	void pay();
	
	
}
class CreditP implements Payment{
	
	public void pay() {
		System.out.println("payment by Credit");
	}

	
}
class CashP implements Payment{
	
	
	public void pay() {
		System.out.println("payment by Cash");
	}

	
	
	
}

public class PayCC {

	public static void main(String[] args) {
		CreditP ob=new CreditP();
		CashP ob1=new CashP();
		//ob.pay();
		ob1.pay();
		
	}

}
