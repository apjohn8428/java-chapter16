package threadTest;

public class MainThread4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlarmThread alarm = new AlarmThread();
		
		alarm.start(); //백그라운드에서 알람 시작
		
		//메인스레드
		for(int i=6; i>=1; i--) {
			System.out.println("남은 시간:" + i + "초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
