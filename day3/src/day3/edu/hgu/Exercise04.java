package day3.edu.hgu;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int num2;
		boolean check = true;
		
		do {
			num=(int)(Math.random()*6)+1;;
			num2=(int)(Math.random()*6)+1;
			if(num+num2!=5) {
				System.out.println("("+num+","+ num2+")");
			}else {
				check = false;
				System.out.println("("+num+","+ num2+")");
				
			}
			
		}while(check);
		
			}

}
