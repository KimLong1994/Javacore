package management_food;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Food {
	// Attributes
	private String foodCode, foodName;
	private double unitPrice;
	private Date manufacturingDate, expiryDate;

	// Getters, Setters
	public String getFoodCode() {
		return foodCode;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	// Constructors
	public Food() {
	}

	public Food(String foodCode, String foodName, double unitPrice, Date manufacturingDate, Date expiryDate) {
		this.foodCode = foodCode;
		this.foodName = foodName;
		this.unitPrice = unitPrice;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
	}

	// Methods
	public void inputManufacturingDate(int day, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		this.manufacturingDate = calendar.getTime();
	}

	public void inputExpiryDate(int day, int month, int year) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month, day);
		this.expiryDate = calendar.getTime();
	}

	public void outputInfoOfFood() {
		Locale localeVN = new Locale("vi", "VN");
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
		String unitPrice = numberFormat.format(getUnitPrice());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String manufacturingDate = simpleDateFormat.format(getManufacturingDate());
		String expiryDate = simpleDateFormat.format(getExpiryDate());

		System.out.println("Info of food: \n" + "Food Code : " + getFoodCode() + "\nFood Name : " + getFoodName()
				+ "\nUnit Price : " + unitPrice + "\nManufacturing Date : " + manufacturingDate + "\nExpiry Date : "
				+ expiryDate);
	}

	// Input about information of food
	public void inputInfoOfFood(Scanner scanner) {
		System.out.println("Please enter your food code");
		this.foodCode = scanner.nextLine();
		checkInputInfoOfFood(foodCode, "Food Code");

		System.out.println("Please enter your food name");
		this.foodName = scanner.nextLine();
		checkInputInfoOfFood(foodName, "Food Name");

		System.out.println("Please enter your price");
		this.unitPrice = Double.parseDouble(scanner.nextLine());
		checkUnitPriceOfFood(unitPrice);
	}

	public void checkInputInfoOfFood(String inputInfo, String title) {
		if (inputInfo.isEmpty()) {
			System.out.println("Please enter again " + title);
			return;
		}
	}

	public void checkUnitPriceOfFood(double unitPrice) {
		if (unitPrice < 0) {
			System.out.println("Please enter again unit price");
			return;
		}
	}

	// Input date of food
	public void inputDateOfFood(Scanner scanner) {
		System.out.println("Please enter your manufacturing date (day, month, year)");
		inputManufacturingDate(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
				Integer.parseInt(scanner.nextLine()));

		System.out.println("Please enter your expiry date (day, month, year)");
		inputExpiryDate(Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()),
				Integer.parseInt(scanner.nextLine()));

		checkInputDate();
	}

	public void checkInputDate() {
		if (getExpiryDate().compareTo(getManufacturingDate()) < 0) {
			System.out.println("Manufacturing date is not bigger than expiry date");
			return;
		}
	}

	public void checkFoodStillCouldUseOrCouldNotUse() {
		Date today = new Date();
		today.getTime();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String todayFormat = simpleDateFormat.format(today);

		if (getExpiryDate().compareTo(today) < 0) {
			System.out.println("Today is " + todayFormat + "this food is expired");
		} else {
			System.out.println("Today is " + todayFormat + "this food is unexpired");
		}
	}

}
