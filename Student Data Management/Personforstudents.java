package labexam1;

import java.util.Scanner;

public abstract class Personforstudents {
	String name;
	String email;
	int phone;
	Scanner input;

	public void addNew() {
		input = new Scanner(System.in);
		System.out.println("Enter new student's Information");
		System.out.print("Name: ");
		name = input.nextLine();
		System.out.print("Email: ");
		email = input.nextLine();
		System.out.print("Phone: ");
		phone = input.nextInt();
	}
	public abstract void insert();
	public abstract void showAll();
}
