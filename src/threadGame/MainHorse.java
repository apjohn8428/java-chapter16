package threadGame;

public class MainHorse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("====================");
		System.out.println("race start");
		System.out.println("====================");
		
		//경주마 스레드 생성
		Horse h1 = new Horse("번개");
		Horse h2 = new Horse("날쌩마");
		Horse h3 = new Horse("제브라이카");
		Horse h4 = new Horse("라플라스");
		
		//스레드 시작 -> 경주 시작
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		
		try {
			h1.join(); //해당 스레드가 끝날 때까지 메인 스레드가 기다리게 만드는 기능
			h2.join();
			h3.join();
			h4.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("====================");
		System.out.println("race over");
		System.out.println("====================");
		
	}

}
