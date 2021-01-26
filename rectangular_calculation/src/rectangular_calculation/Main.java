package rectangular_calculation;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		rectangle.inputHeightWidth(scanner);
		rectangle.outputHeightWidth();
	}

}
