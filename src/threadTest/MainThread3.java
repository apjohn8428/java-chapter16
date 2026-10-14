package threadTest;

public class MainThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HelloThread ht1 = new HelloThread();
		HiThread ht2 = new HiThread();
		
		ht1.start(); //입력한 순서대로 실행되지 않는다
		ht2.start();
	}

}
