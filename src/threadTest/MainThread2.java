package threadTest;

public class MainThread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //sleep단위는 ms -> 1초간 cpu 휴식
			} catch (InterruptedException e) { //예외처리를 하지 않으면 사용불가
				e.printStackTrace();
			} 
			
		}
	}

}
