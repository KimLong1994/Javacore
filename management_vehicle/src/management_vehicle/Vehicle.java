package management_vehicle;

import java.util.Scanner;

public class Vehicle {
	// Attributes
	private int vehicleCode, capactiy;
	private float value;
	private String owner, description;

	// Gets,sets
	public int getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(int vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public int getCapactiy() {
		return capactiy;
	}

	public void setCapactiy(int capactiy) {
		this.capactiy = capactiy;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String onwer) {
		this.owner = onwer;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Constructors
	public Vehicle() {
	}

	public Vehicle(int vehicleCode, int capacity, float value, String owner, String description) {
		this.vehicleCode = vehicleCode;
		this.capactiy = capacity;
		this.value = value;
		this.owner = owner;
		this.description = description;
	}

	// Methods
	public float calculateTax() {
		float tax = 0;
		float capactity = getCapactiy();
		float value = getValue();

		if (capactity < 100) {
			tax = value / 100;
		} else if (capactity >= 100 && capactity < 200) {
			tax = (value * 3) / 100;
		} else {
			tax = (value * 5) / 100;
		}

		return tax;
	}

	public void inputInfo(Scanner scanner) {
		System.out.println("Please enter your vehicle code: ");
		setVehicleCode(Integer.parseInt(scanner.nextLine()));

		System.out.println("Please enter your capacity: ");
		setCapactiy(Integer.parseInt(scanner.nextLine()));

		System.out.println("Please enter your value: ");
		setValue(Float.parseFloat(scanner.nextLine()));

		System.out.println("Please enter your owner: ");
		setOwner(scanner.nextLine());

		System.out.println("Please enter your description: ");
		setDescription(scanner.nextLine());
	}

	public void outputInfo() {
		System.out.println("Vehicle Code: " + getVehicleCode() + " - " + "Capacity: " + getCapactiy() + " - "
				+ "Value: " + getValue() + " - " + "Owner: " + getOwner() + " - " + "Description: " + getDescription());
	}
}
