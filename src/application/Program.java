package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		Account account1 = new Account(100, "Maria", 0.0);
		BusinessAccount bcc = new BusinessAccount(200, "Alcir", 0.0, 990.00);

		// UPCASTING
		Account account2 = bcc;
		Account account3 = new BusinessAccount(201, "Amanda", 100.0, 250.5);
		Account account4 = new SavingsAccount(300, "Julio", 120.01, 0.02);

		// DOWNCASTING
		BusinessAccount bcc2 = (BusinessAccount) account2;
		bcc2.loan(1000.90);

		// Isso resulta em erro, pois SavingAccount é uma Account, mas não é uma
		// BusinessAccount
		// O erro só acontece em momento de execução
		//bcc2 = (BusinessAccount) account4;
		
		// Para evitar erros de DOWNCASTING use INSTANCEOF
		if(account4 instanceof BusinessAccount) {
			bcc2 = (BusinessAccount) account4;
			bcc2.loan(100);
			System.out.println("Loan!");
		}
		
		if(account4 instanceof SavingsAccount) {
			SavingsAccount account5 = (SavingsAccount) account4;
			account5.updateBalance();
			System.out.println("UPDATE!");
		}
		
		

	}

}
