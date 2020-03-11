package day4.edu.hgu;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.keyTurnOn();
		System.out.println("현재speed : "+myCar.speed);
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재 speed : "+speed);

	}

}
