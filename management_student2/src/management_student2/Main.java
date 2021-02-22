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
				students = new Student[Integer.parseInt(scanner.nextLine())];

				for (int index = 0; index < students.length; index++) {
					System.out.println("Student " + (index + 1));
					students[index] = new Student();
					students[index].inputStudent(scanner);
				}
				break;
			}

			case 2: {
				// Sort ascending
				for (int a = 0; a < students.length - 1; a++) {
					for (int b = a + 1; b < students.length; b++) {
						if (students[a].getStudentCode() > students[b].getStudentCode()) {
							Student temp = students[a];
							students[a] = students[b];
							students[b] = temp;
						}
					}
				}

				for (Student student : students) {
					student.outputStudent();
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
		System.out.println("1. Input student");
		System.out.println("2. Output student");
		System.out.println("3. Tap another to stop program");
	}

}
