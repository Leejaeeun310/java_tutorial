package day2.edu.hgu;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 356;
		System.out.println(value/100*100);
		
		int lengthTop = 5;
		int lengtBottom= 10;
		int height=7;
		double area= (double)((lengthTop+lengtBottom)*height)/2;
		System.out.println("area : " + area);
		
		
		int x=10;
		int y=5;
		
		System.out.println((x>7)&& (y<=5));
		System.out.println((x%3==2)||(y%2 !=1));
		

	}

}
