package management_bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account[] accounts = null;
		boolean run = true;

		do {
			menu();

			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {

			case 1: {
				System.out.println("How many accounts do you want ?");
				accounts = new Account[Integer.parseInt(scanner.nextLine())];

				for (int index = 0; index < accounts.length; index++) {
					System.out.println("Account " + (index + 1));
					accounts[index] = new Account();
					accounts[index].inputInfoAccount(scanner);
				}

				break;
			}

			case 2: {
				if (accounts != null) {
					for (Account account : accounts) {
						account.outInfoAccount();
					}
				} else {
					System.out.println("Accounts are empty");
				}
				break;
			}

			case 3: {
				if (accounts == null) {
					System.out.println("Accounts are empty");
					break;
				}

				int checkIndex = -1;

				System.out.println("Please enter your account number");
				int accountNumber = Integer.parseInt(scanner.nextLine());

				for (int index = 0; index < accounts.length; index++) {
					if (accounts[index].getAccountNumber() == accountNumber) {
						checkIndex = index;
						break;
					}
				}

				if (checkIndex < 0) {
					System.out.println("Please try again");
					break;
				}

				System.out.println("How much money do you want to add ?");
				double money = Double.parseDouble(scanner.nextLine());
				accounts[checkIndex].inputMoneyToCard(money, accountNumber);

				break;
			}

			case 4: {
				if (accounts == null) {
					System.out.println("Accounts are empty");
					break;
				}

				int checkIndex = -1;

				System.out.println("Please enter your account number");
				int accountNumber = Integer.parseInt(scanner.nextLine());

				for (int index = 0; index < accounts.length; index++) {
					if (accounts[index].getAccountNumber() == accountNumber) {
						checkIndex = index;
						break;
					}
				}

				if (checkIndex < 0) {
					System.out.println("Please try again");
					break;
				}

				System.out.println("How much money do you want to withdrawn ?");
				double money = Double.parseDouble(scanner.nextLine());
				accounts[checkIndex].withdrawMoneyFromCard(money, accountNumber);

				break;
			}

			case 5: {
				if (accounts == null) {
					System.out.println("Accounts are empty");
					break;
				}

				int checkIndex = -1;

				System.out.println("Please enter your account number");
				int accountNumber = Integer.parseInt(scanner.nextLine());

				for (int index = 0; index < accounts.length; index++) {
					if (accounts[index].getAccountNumber() == accountNumber) {
						checkIndex = index;
						break;
					}
				}

				if (checkIndex < 0) {
					System.out.println("Please try again");
					break;
				}

				accounts[checkIndex].expiratedDateMoney();

				break;
			}

			case 6: {
				if (accounts == null) {
					System.out.println("Accounts are empty");
					break;
				}

				// Person Transfers Money
				int indexOfPersonTransferMoney = -1;

				System.out.println("Please enter your account number");
				int accountTransferNumber = Integer.parseInt(scanner.nextLine());

				for (int index = 0; index < accounts.length; index++) {
					if (accounts[index].getAccountNumber() == accountTransferNumber) {
						indexOfPersonTransferMoney = index;
						break;
					}
				}

				if (indexOfPersonTransferMoney < 0) {
					System.out.println("Person transfer is invalid");
					break;
				}

				// Person Received Money
				int indexOfPersonReceivedMoney = -1;

				System.out.println("Please enter your account received number");
				int accountReceivedNumber = Integer.parseInt(scanner.nextLine());

				if (accountTransferNumber == accountReceivedNumber) {
					System.out.println("Person transfer and person received are invalid");
					break;
				}

				for (int index = 0; index < accounts.length; index++) {
					if (accounts[index].getAccountNumber() == accountReceivedNumber) {
						indexOfPersonReceivedMoney = index;
						break;
					}
				}

				if (indexOfPersonReceivedMoney < 0) {
					System.out.println("Person received is invalid");
					break;
				}

				// Process Transfer Money And Received Money
				System.out.println("How much money do you want to transfer ?");
				double transferMoney = Double.parseDouble(scanner.nextLine());
				accounts[indexOfPersonReceivedMoney].inputMoneyToCard(transferMoney, accountReceivedNumber);
				accounts[indexOfPersonTransferMoney].withdrawMoneyFromCard(transferMoney, accountTransferNumber);

				break;
			}

			default:
				run = false;
				System.out.println("===============End===============");
				break;
			}
		} while (run);

	}

	public static void menu() {
		System.out.println("What do you want ?");
		System.out.println("1. Enter info for client");
		System.out.println("2. Show all info of client");
		System.out.println("3. Input money to card");
		System.out.println("4. With drawn money from card");
		System.out.println("5. Expire date money of client");
		System.out.println("6. Transfer money to another card");
		System.out.println("7. Tap others number to stop program");
	}
}
