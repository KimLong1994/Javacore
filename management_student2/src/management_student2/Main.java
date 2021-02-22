package management_student2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Student[] students = null;
		boolean run = true;

		do {
			menu();

			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {
			case 1: {
				System.out.println("How much student do you want ?");
				break;
			}

			case 2: {
				break;
			}
			default:
				run = false;
				System.out.println("Program stops");
				break;
			}
		} while (run);

	}

	public static void menu() {
		System.out.println("What do you want ?");
		System.out.println("1. Input student");
		System.out.println("2. Output student");
		System.out.println("3. Tap another to stop program");
	}

}
