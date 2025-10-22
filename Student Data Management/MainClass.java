package labexam1;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1. Add a new student");
			System.out.println("2. Add a new instructors");
			System.out.println("3. Add a new clerk");
			System.out.println("4. Show all students");
			System.out.println("5. Show all instructors");
			System.out.println("6. Show all clerks");
			System.out.println("9. Exit");
			System.out.println("--------------------------------------------");
			System.out.print("Enter an option from above choices: ");
			int selectedOption = input.nextInt();
			System.out.println();
			if(selectedOption==9) {
				System.out.println("Program is terminating.....");
				break;
			}
			switch(selectedOption) {
				case 1:
					Student si = new Student();
					si.addNew();	// using DataOutputStream
					break;
				case 2:
					// using DataOutputStream
					///System.out.println("Implement code for inserting an instructor's information.");
					Instructor isr = new Instructor();
					isr.addNew();	
					break;										
				case 3:
					Clerk c = new Clerk();
					c.addNew();
					break;
				case 4:
					Student so = new Student();
					so.showAll();	// using DataInputStream
					break;
				case 5:
					// using DataInputStream
					Instructor is = new Instructor();
					is.showAll();	// using DataInputStream
				///	System.out.println("Implement code to show all instructors.");
					break;
				case 6:
					// using BufferedInputStream
					Clerk cs = new Clerk();
					cs.showAll();
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
		input.close();
	}
}

