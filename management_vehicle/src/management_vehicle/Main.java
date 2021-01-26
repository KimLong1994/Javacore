package management_vehicle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Vehicle[] vehicles = null;

		boolean run = true;
		do {
			System.out.println("What's your option ?");
			System.out.println("1. Import infomation for vehicle");
			System.out.println("2. Export infomation for vehicles");
			System.out.println("Another to stop program");

			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {
			case 1: {
				System.out.println("How many vehicle do you want ?");
				vehicles = new Vehicle[Integer.parseInt(scanner.nextLine())];

				for (int index = 0; index < vehicles.length; index++) {
					System.out.println("Vehicle" + (index + 1));
					Vehicle vehicle = vehicles[index] = new Vehicle();
					vehicle.inputInfo(scanner);
				}
				break;
			}
			case 2: {
				for (Vehicle vehicle : vehicles) {
					vehicle.outputInfo();
				}
				break;
			}
			default:
				run = false;
				break;
			}
		} while (run);
	}

}
