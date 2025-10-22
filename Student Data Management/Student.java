package labexam1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Student extends Personforstudents {
	double credits;
	public void addNew() {
		super.addNew();
		System.out.print("Credits: ");
		credits = input.nextDouble();
		insert();
	}
	
	@Override
	public void insert() {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Users/asus/eclipse-workspace/Cse Java Sec1/src/labexam1/tbl_Student", true));
			dos.writeUTF(name);
			dos.writeUTF(email);
			dos.writeInt(phone);
			
			dos.writeDouble(credits);
			dos.flush();
			dos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showAll() {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("C:/Users/asus/eclipse-workspace/Cse Java Sec1//src/labexam1/tbl_student"));
			System.out.println("\nName\t\tCredits\t\tphone\t\tEmail\n---------------------------------------------");
			while(dis.available() != 0) {
				name = dis.readUTF();
				email = dis.readUTF();
				phone = dis.readInt();
				credits = dis.readDouble();
				System.out.println(name+"\t\t"+credits+"\t\t"+phone+"\t\t"+email);
			}
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}