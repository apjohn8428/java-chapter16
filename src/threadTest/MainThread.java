package threadTest;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
//		t1.run(); 일반 메서드 실행 -> run을 사용하면 스레드 적용이 안된다
		
		t1.start();
		t2.start();
	}

}
