package threadTest;

public class ThreadTest01 {

	public static void main(String[] args) {

		//스레드를 사용하지 않는 경우
/*		for(int i=1; i<=5; i++) {
			System.out.println("첫 번째 작업:" + i);
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println("두 번째 작업:" + i);
		} */
		
		//스레드를 사용하는 경우
		Thread t1 = new Thread( () -> {  //람다식으로 만들어야 한다
				for(int i=1; i<=5; i++) {
					System.out.println("첫 번째 작업:" + i);
				}
				
		});
		
		Thread t2 = new Thread( () -> {  
				for(int i=1; i<=5; i++) {
					System.out.println("두 번째 작업:" + i);
			}
			
		}); //스레드를 만들기만 했기 때문에 실행 안 됨
		
		t1.start(); //t1 스레드 시작
		t2.start();
	}

}
