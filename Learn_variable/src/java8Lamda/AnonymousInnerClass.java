package java8Lamda;

public class AnonymousInnerClass {

	public static void main(String[] args) {
//		Runnable r=new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i=0;i<5;i++) {
//					
//					System.out.println("helloow");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//				
//			}};
			
			Runnable r=() -> { for(int i=0;i<5;i++)
				
				System.out.println("helloow");
				
			};
			
			Thread t1=new Thread(r);
			t1.start();
			for(int i=0;i<5;i++) {
				
				System.out.println("hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		

	}

}
