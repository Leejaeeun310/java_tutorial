package day7.edu.hgu;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.setBalance(-1);
		System.out.println("현재잔고 : "+ account.getBalance());
		
		account.setBalance(10000);
		System.out.println("현재잔고 : "+ account.getBalance());
		
		account.setBalance(-1);
		System.out.println("현재잔고 : "+ account.getBalance());
		
		account.setBalance(10000);
		System.out.println("현재잔고 : "+ account.getBalance());

		account.setBalance(10000000);
		System.out.println("현재잔고 : "+ account.getBalance());
		
		
		account.setBalance(2000);
		System.out.println("현재잔고 : "+ account.getBalance());
	
	}
}
