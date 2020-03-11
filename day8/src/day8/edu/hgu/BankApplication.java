package day8.edu.hgu;
import java.util.Scanner;

import day7.edu.hgu.Account;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("________________________________________________");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료 ");
			System.out.println("________________________________________________");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1) {
				createAccount();
			} else if(selectNo ==2) {
				accountList();
			}else if  (selectNo ==3) {
				deposit();
			}else if (selectNo ==4) {
				withdraw();
			}else if (selectNo ==5) {
				run=false;
			}
			
			
		}System.out.println("프로그램 종료ㅛㅛㅛㅛ");

	}
	private static void createAccount() {
		System.out.println("______");
		System.out.println("계좌생성 ");
		System.out.println("______");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		
		System.out.print("예금주  : ");
		String owner = scanner.next();
		
		System.out.print("초기입금 : ");
		int balance = scanner.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]== null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다. ");
				break;
			}
			
		}
		
	}
	private static void accountList() {
		System.out.println("______");
		System.out.println("계좌목록  ");
		System.out.println("______");
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				
				System.out.println(accountArray[i].getAno()+"\t"
				+ accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
				
			}
			
		}
		
	}
	private static void deposit() {
		System.out.println("______");
		System.out.println("예금  ");
		System.out.println("______");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("예금액  : ");
		int balance = scanner.nextInt();
		
	
		
	}
	private static void withdraw() {
		
	}
	private static Account findAccount(String ano) {
		for(int i=0;i<accountArray.length; i++) {
			if
		}
	}

}
