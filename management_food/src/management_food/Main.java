package management_food;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Food> foods = new ArrayList<Food>();

		boolean run = true;
		do {
			menu();
			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {
			case 1: {
//				System.out.println("How many do you want to add ?");
//				int elementFood = Integer.parseInt(scanner.nextLine());
//
//				for (int index = 0; index < elementFood; index++) {
//					System.out.println("Food " + (index + 1));
//					Food food = new Food();
//					food.inputInfoOfFood(scanner);
//					food.inputDateOfFood(scanner);
//				}
				boolean addFood = true;
				do {
					Food food = new Food();
					food.inputInfoOfFood(scanner);
					food.inputDateOfFood(scanner);

					boolean errFoodCode = food.checkInputInfoOfFood(food.getFoodCode(), "Food Code");
					boolean errFoodName = food.checkInputInfoOfFood(food.getFoodName(), "Food Name");
					boolean errUnitPrice = food.checkUnitPriceOfFood(food.getUnitPrice());
					boolean errDate = food.checkInputDate();

					if (errFoodName || errFoodCode || errUnitPrice || errDate) {
						System.out.println(
								"Please try again because some reason above could not allow you to add food into list");
					} else {
						foods.add(food);
						System.out.println("Add Success");
					}

					System.out.println("Do you want to continue to add food ?");
					System.out.println("1. Add");
					System.out.println("2. Choose another to stop");
					int add = Integer.parseInt(scanner.nextLine());
					if (add != 1) {
						addFood = false;
					}

				} while (addFood);
				break;
			}
			case 2: {
				if (foods.size() > 0) {
					for (Food food : foods) {
						food.outputInfoOfFood();
						food.checkFoodStillCouldUseOrCouldNotUse();
						System.out.println("====================================");
					}
				} else {
					System.out.println("Foods are empty");
				}

				break;
			}
			default:
				run = false;
				System.out.println("================END================");
				break;
			}

		} while (run);

	}

	public static void menu() {
		System.out.println("What do you want ?");
		System.out.println("1. Enter info for food");
		System.out.println("2. Show all info of food");
		System.out.println("3. Choose another number to stop");
	}
}
