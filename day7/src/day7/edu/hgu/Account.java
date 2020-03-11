package day7.edu.hgu;

public class Account {
	int MIN_BALANCE = 0;
	int MAX_BALANCE = 1000000;
	int balance=0;
	
	public void setBalance(int balance) {
		if(balance<MIN_BALANCE||balance>MAX_BALANCE) {
			balance= this.balance;
		}
		else {
			this.balance = balance;
		}
	}
	public int getBalance() {
		return balance;
	}
	
}
