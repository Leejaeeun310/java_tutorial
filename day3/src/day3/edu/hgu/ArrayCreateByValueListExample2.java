package day3.edu.hgu;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : "+sum2);
		System.out.println();
		

	}

	public static int add(int[] scores) {
		int sum =0;
		for(int i=0;i<3;i++) {
			sum+=scores[i];
			
		}
		return sum;
	}
}
