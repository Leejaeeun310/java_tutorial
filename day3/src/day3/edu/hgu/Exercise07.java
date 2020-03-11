package day3.edu.hgu;
import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		boolean run =true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int keyCoade=0;
		String inputString;
		while(run) {
			System.out.println("__________________________________");
			System.out.println("| 1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("__________________________________");
			System.out.println("선택 > ");
			
			keyCoade = System.in.read();
			
			if(keyCoade==49) {
				System.out.printf("예금액 > ");
				inputString=scanner.nextLine();
				System.out.println(inputString);
			
				
			}else if(keyCoade==50) {
				System.out.println("출금 > ");

			}else if(keyCoade==51) {
				System.out.println("balance > ");

			}else if(keyCoade==52) {
				System.out.println("exit");
				run = false;

				
			}

		}
	}

}
