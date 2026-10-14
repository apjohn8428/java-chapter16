package threadGame;

public class Horse extends Thread {

	//100m 경마
	private String name; //말 이름
	private int distance = 0; //말이 달린 거리
	
	public Horse(String name) { //말 이름을 생성시 인수로 받기 위한 장치
		super();
		this.name = name;
	}

	public String getHorseName() {
		return name;
	}

	public void setHorseName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		while(distance < 100) {
			//속도는 1~5m
			int ranstep = (int) (Math.random()*5 + 1);
			
			distance += ranstep;
			
			//100m 보정
			if(distance > 100) {
				distance = 100;
			}
			
			//진행 표시
			String track = "";
			for(int i=0; i<distance; i=i+2) {
				track = track + ">";
			}
			
			System.out.println("[" + this.name + "]" + distance + "m" + track);
			
			try {
				Thread.sleep(200); //게임이 너무 빨리 끝나지 않도록 시간 설정
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//결승점을 통과한 경주마의 이름 출력
		System.out.println("[" + this.name + "] 결승점 통과");
	}
	
	
	
}
