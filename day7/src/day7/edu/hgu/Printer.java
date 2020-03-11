package day7.edu.hgu;

public class Printer {
	
	//메소드 오버로딩 
	//같은 이름의 메소드를 여러개 선언 매개변수 타입이 다르기 때문에
	static void println(int x) {
		System.out.println(x);
		
		
	}
	
	static void println(boolean x) {
		System.out.println(x);
		
	}
	
	static void println(double x) {
		System.out.println(x);
		
	}
	
	static void println(String x) {
		System.out.println(x);
		
	}
}
