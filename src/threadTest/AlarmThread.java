package threadTest;

public class AlarmThread extends Thread {

	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("ring! ring! ring!"); //2초마다 알람 실행
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
}
