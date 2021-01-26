package rectangular_calculation;

import java.util.Scanner;

public class Rectangle {
	float height;
	float width;

	public void inputHeightWidth(Scanner scanner) {
		System.out.println("Please enter your height: ");
		this.height = Float.parseFloat(scanner.nextLine());
		
		System.out.println("Please enter your width: ");
		this.width = Float.parseFloat(scanner.nextLine());
	}

	public void outputHeightWidth() {
		float perimeter = calculatePerimeter();
		float area = calculateArea();

		System.out.println("Your perimeter is: " + perimeter);
		System.out.println("Your calculate is: " + area);
	}

	public float calculatePerimeter() {
		return (this.width + this.height) * 2;

	}

	public float calculateArea() {
		return this.width * this.height;
	}

}
