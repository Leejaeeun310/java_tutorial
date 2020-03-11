package day4.edu.hgu;

public class Car {
	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("Turn on the key");
	}
	void run() {
		for(int i=10; i<=50; i++) {
			speed = i;
			System.out.println("Run.(시속 : "+speed+"Km/h");
		}
	}
}
