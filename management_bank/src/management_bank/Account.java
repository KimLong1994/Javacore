package management_bank;

import java.text.NumberFormat;
import java.util.Scanner;

public class Account {
	// Attributes
	private long accountNumber;
	private String accountName;
	private double accountMoney;
	private double interestRate = 0.035;

	// Gets,Sets
	public double getInterestRate() {
		return interestRate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountMoney() {
		return accountMoney;
	}

	public void setAccountMoney(double accountMoney) {
		this.accountMoney = accountMoney;
	}

	// Constructors
	Account() {
	}

	Account(long accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountMoney = 50;
	}

	// Methods
	public double inputMoneyToCard(double inputMoney) {
		if (inputMoney < 0) {
			System.out.println("Input money is invalid");
			return getAccountMoney();
		}

		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
		System.out.println("Account money is added " + currencyEN.format(inputMoney));

		return getAccountMoney() + inputMoney;
	}

	public double withdrawMoneyFromCard(double outputMoney) {
		double accountMoney = getAccountMoney();

		if (accountMoney == 0) {
			System.out.println("Account money is zero");
			return getAccountMoney();
		}

		if (accountMoney < outputMoney) {
			System.out.println("Account money is smaller than output money");
			return getAccountMoney();
		}

		if (outputMoney < 0) {
			System.out.println("Output money is invalid");
			return getAccountMoney();
		}

		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
		System.out.println("Account money is subtracted " + currencyEN.format(outputMoney));

		return getAccountMoney() - outputMoney;
	}

	public double expiratedDateMoney() {
		double accountMoney = getAccountMoney();
		double interestRate = getInterestRate();

		if (accountMoney >= 0) {
			accountMoney = accountMoney + (accountMoney * interestRate);
			NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
			System.out.println("Account money is recieved " + currencyEN.format(accountMoney));
			return accountMoney;
		} else {
			System.out.println("Account money is invalid");
			return accountMoney;
		}
	}

	public void inputInfoAccount(Scanner scanner) {
		System.out.println("Please enter account number:");
        setAccountNumber(Integer.parseInt(scanner.nextLine()));
      
        System.out.println("Please enter account name:");
        setAccountNumber(Integer.parseInt(scanner.nextLine()));
        
        
        setAccountMoney(50);
	}

	public void outInfoAccount() {
		NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String accountMoney = currencyEN.format(getAccountMoney());
        
        System.out.println("Account Number: " + getAccountNumber() + " - " + 
        "Account Name: " + getAccountName() + " - " + "Account Money: " + accountMoney
        		);
	}
}
