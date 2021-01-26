package management_student;

import java.util.Scanner;

public class Student {
	// Attributes
	private String studentCode;
	private String studentName;
	private float theoreticalPoint, practicalPoint;

	// Gets,Sets
	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(float theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public float getPracticalPoint() {
		return practicalPoint;
	}

	public void setPracticalPoint(float practicalPoint) {
		this.practicalPoint = practicalPoint;
	}

	// Constructors
	public Student() {
	}

	public Student(String studentCode, String studentName, float theoreticalPoint, float practicalPoint) {
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicalPoint = practicalPoint;
	}

	// Methods
	public float calculateAveragePoint() {
		return (getPracticalPoint() + getTheoreticalPoint()) / 2;
	}

	public void outputInfoStudent() {
		System.out.println("Code: " + getStudentCode() + " - " + "Name: " + getStudentName() + " - "
				+ "Theoretical Point " + getTheoreticalPoint() + " - " + "Practical Point: " + getPracticalPoint()
				+ " - " + "Average Point: " + calculateAveragePoint());
	}

	public void inputInfoStudent(Scanner scanner) {
		System.out.println("Please enter your code: ");
		setStudentCode(scanner.nextLine());
		
		System.out.println("Please enter your name: ");
		setStudentName(scanner.nextLine());
		
		System.out.println("Please enter your theoretical point: ");
		setTheoreticalPoint(Float.parseFloat(scanner.nextLine()));
		
		System.out.println("Please enter your practical point: ");
		setPracticalPoint(Float.parseFloat(scanner.nextLine()));
	}
}
