package management_albumcd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Album[] albums = null;
		boolean run = true;

		do {
			menu();

			int option = Integer.parseInt(scanner.nextLine());

			switch (option) {
			case 1: {
				System.out.println("How much CD do you want to add ?");
				albums = new Album[Integer.parseInt(scanner.nextLine())];

				for (int index = 0; index < albums.length; index++) {
					System.out.println("CD: " + (index + 1));
					albums[index] = new Album();
					albums[index].inputAlbum(scanner);
				}

				break;
			}

			case 2: {
				if (albums.length < 0) {
					System.out.println("CD is empty in album");
				} else {
					int allCDInAlbum = albums.length;
					System.out.println("All CD in album is: " + allCDInAlbum);
				}
				break;
			}
			case 3: {
				if (albums.length < 0) {
					System.out.println("CD is empty in album");
				} else {
					double total = 0;
					for (Album album : albums) {
						total += album.getPrice();
					}
					System.out.println("Total price CD in album: " + total);
				}
				break;
			}
			case 4: {
				// Sort descending
				if (albums.length < 0) {
					System.out.println("CD is empty in album");
				} else {
					for (int a = 0; a < albums.length - 1; a++) {
						for (int b = a + 1; b < albums.length; b++) {
							if (albums[a].getPrice() < albums[b].getPrice()) {
								Album temp = albums[a];
								albums[a] = albums[b];
								albums[b] = temp;
							}
						}
					}

					for (Album album : albums) {
						album.outputAlbum();
					}
				}

				break;
			}
			case 5: {
				// Sort ascending
				if (albums.length < 0) {
					System.out.println("CD is empty in album");
				} else {
					for (int a = 0; a < albums.length - 1; a++) {
						for (int b = a + 1; b < albums.length; b++) {
							if (albums[a].getCdLabel().compareTo(albums[b].getCdLabel()) > 0) {
								Album temp = albums[a];
								albums[a] = albums[b];
								albums[b] = temp;
							}
						}
					}

					for (Album album : albums) {
						album.outputAlbum();
					}
				}
				break;
			}
			case 6: {
				if (albums.length < 0) {
					System.out.println("CD is empty in album");
				} else {
					for (Album album : albums) {
						album.outputAlbum();
					}
				}

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
		System.out.println("1. Add CD in Album");
		System.out.println("2. All CD in Album");
		System.out.println("3. Total price CD in Album");
		System.out.println("4. Sorting descending by price");
		System.out.println("5. Sorting ascending by label");
		System.out.println("6. Output all CD in Album");
		System.out.println("7. Tap another numbers to stop program");
	}

}
