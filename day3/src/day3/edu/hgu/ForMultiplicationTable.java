package day3.edu.hgu;

public class ForMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=2;num<=9;num++) {
			System.out.println("***"+num+"단***");
			for(int num2=1; num2<=9; num2++) {
				//int result = num*num2;
				System.out.println(num+"*"+num2+"="+(num*num2));
			}
		}
	}

}



