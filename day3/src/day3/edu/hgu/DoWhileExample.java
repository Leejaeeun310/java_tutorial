package day3.edu.hgu;
import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input your message : ");
		System.out.println("If you want to exit program, input keyboad \"P\"please~");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
			
		}while(!inputString.equals("q"));
		System.out.println();
		System.out.println("exit");
		
		
	}


}
