package labexam1;

import java.util.Scanner;

public abstract class PersonforCLREK {
	Double Salary;
	String email;
	int phone;
	Scanner input;

	public void addNew() {
		input = new Scanner(System.in);
		System.out.println("Enter new CLerk's Information");
		System.out.print("Email: ");
		email = input.nextLine();
		System.out.print("Phone: ");
		phone = input.nextInt();
		System.out.print("Salary: ");
		Salary = input.nextDouble();
	}
	public abstract void insert();
	public abstract void showAll();
}
