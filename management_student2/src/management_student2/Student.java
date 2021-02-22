package management_student2;

import java.util.Scanner;

public class Student {
	// Attributes
	private int studentCode;
	private String studentName;
	private String studentAddress;
	private int studentNumber;

	// Getters,setters
	public int getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	// Constructors
	Student() {
	}

	Student(int studentCode, String studentName, String studentAddress, int studentNumber) {
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentNumber = studentNumber;
	}

	// Methods
	public void inputStudent(Scanner scanner) {
		System.out.println("Please enter your student code ?");
		setStudentCode(Integer.parseInt(scanner.nextLine()));

		System.out.println("Please enter your student name ?");
		setStudentName(scanner.nextLine());

		System.out.println("Please enter your student address ?");
		setStudentAddress(scanner.nextLine());

		System.out.println("Please enter your student code ?");
		setStudentNumber(Integer.parseInt(scanner.nextLine()));
	}

	public void outputStudent() {
		System.out.println("Student code: " + getStudentCode() + " - " + "Student name: " + getStudentName() + " - "
				+ getStudentName() + "Student address: " + getStudentAddress() + " - " + "Student number: "
				+ getStudentNumber());
	}

}
