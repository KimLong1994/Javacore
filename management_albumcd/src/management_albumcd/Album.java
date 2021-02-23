package management_albumcd;

import java.util.Scanner;

public class Album {
	// Attributes
	private int cdCode;
	private String cdLabel;
	private String singer;
	private int songQuantity;
	private double price;

	// Getters,
	public int getCdCode() {
		return cdCode;
	}

	public void setCdCode(int cdCode) {
		this.cdCode = cdCode;
	}

	public String getCdLabel() {
		return cdLabel;
	}

	public void setCdLabel(String cdLabel) {
		this.cdLabel = cdLabel;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getSongQuantity() {
		return songQuantity;
	}

	public void setSongQuantity(int songQuantity) {
		this.songQuantity = songQuantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// Constructors
	Album() {
	}

	Album(int cdCode, String cdLabel, String singer, int songQuantity, double price) {
		this.cdCode = cdCode;
		this.cdLabel = cdLabel;
		this.singer = singer;
		this.songQuantity = songQuantity;
		this.price = price;
	}
	
	// Methods
	public void inputAlbum(Scanner scanner) {
		System.out.println("Please enter your cd code");
		setCdCode(Integer.parseInt(scanner.nextLine()));

		System.out.println("Please enter your student cd label");
		setCdLabel(scanner.nextLine());

		System.out.println("Please enter your cd singer");
		setSinger(scanner.nextLine());

		System.out.println("Please enter your cd price");
		setPrice(Double.parseDouble(scanner.nextLine()));
	}
	
	public void outputAlbum() {
		System.out.println("CD code: " + getCdCode() + " - " + "CD label: " + getCdLabel() + " - "
				+ getCdLabel() + "CD singer: " + getSinger() + " - " + "CD price: "
				+ getPrice());
	}

}
