package day1.edu.hgu;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 384;
		byte byteValue =(byte)intValue;
		System.out.println(intValue);
		System.out.println(byteValue);
		
		int intCValue = 'A'; // 65
		System.out.println(intCValue);
		
		int num1 = 123456780;
		int num2 = 123456780;
		float num3 = num2;
		
		num2 = (int)num3;
		int result = num1-num2;
		System.out.println(result);
		
		char ai = 'A';
		System.out.println(ai);
		int result1 = ai +1;
		System.out.println(result1);
		char na = (char)result1;
		System.out.println(na);
		
	
		
		
	}

}
