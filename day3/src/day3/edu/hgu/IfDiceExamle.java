package day3.edu.hgu;

public class IfDiceExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*6)+1;
		
		System.out.println(num);
		if (num==1) {
			System.out.println("1입니다\n");
			
		}else if(num==2) {
			System.out.println("2입니다\n");
		}else if(num==2) {
			System.out.println("3입니다\n");
		}else if(num==2) {
			System.out.println("4입니다\n");
		}else if(num==2) {
			System.out.println("5입니다\n");
		}else {
			System.out.println("6입니다\n");
		}
		
	
		int num2 = (int) (Math.random()*6)+1;
		
		System.out.println(num2);
	}
	

}
