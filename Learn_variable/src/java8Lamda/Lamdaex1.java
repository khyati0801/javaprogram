package java8Lamda;
@FunctionalInterface
interface Lamda{
	
	public void m1(int a,int b);
	default void m2() {}
	static void m3() {}
}


public class Lamdaex1 {

	public static void main(String[] args) {
		Lamda l1=(a,b)-> System.out.println(a+b);
		l1.m1(10,20);

	}

}
