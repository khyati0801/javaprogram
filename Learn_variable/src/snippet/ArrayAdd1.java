package snippet;

public class ArrayAdd1 {
	public void ArraySum(int b[],int Sumvalue) {
		a:for(int i=0;i<b.length-1;i++) {
			b:for(int j=i+1;j<b.length;j++) {
				
				
				//int s=b[i]+b[j];
				if(b[i]+b[j]==Sumvalue){
			
					
					//	System.out.println(s);
				System.out.println("i="+i+" "+"j="+j);
				
				
				System.out.println("i="+b[i]+" "+"j="+b[j]);
				break a;
				
				
				}
			}
			
			
		}
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		ArrayAdd1 ob1Add1=new ArrayAdd1();
		
		int a[]= {2,4,5,3,4};
		int sum=8;
		ob1Add1.ArraySum(a,sum);
		
		
		
		
	}

}
