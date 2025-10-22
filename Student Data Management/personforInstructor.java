package labexam1;

import java.util.Scanner;

public abstract class personforInstructor {
	String name;
	String department;
	boolean isvisitinginstructor;
	Scanner input;

	public void addNew() {
		input = new Scanner(System.in);
		System.out.println("Enter Instructor's Information");
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("department: ");
		department = input.nextLine();
		System.out.print("isvisitinginstructor: ");
		isvisitinginstructor = input.nextBoolean();
	}
	public abstract void insert();
	public abstract void showAll();
}
