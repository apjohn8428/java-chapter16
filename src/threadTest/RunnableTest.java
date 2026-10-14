package threadTest;

public class RunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<=5; i++) {
					System.out.println(i);
				}
				
			}
		};
		
		Thread t1 = new Thread(r);
		
		t1.start();
	}

}
