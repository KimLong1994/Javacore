package management_student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();

		System.out.println("How many student do you want ?");
		int elements = Integer.parseInt(scanner.nextLine());

		for (int index = 0; index < elements; index++) {
			System.out.println("Student " + (index + 1));
			Student student = new Student();
			student.inputInfoStudent(scanner);
			students.add(student);
		}

		for (Student student : students) {
			student.outputInfoStudent();
		}
	}
}
