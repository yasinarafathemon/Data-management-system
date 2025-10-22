package labexam1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Instructor extends personforInstructor {
	String department;
	boolean isvisitinginstructor;
	public void addNew() {
		super.addNew();
    	///System.out.print("department: ");
	department = input.nextLine();
		insert();
	}
	
	@Override
	public void insert() {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/Users/asus/eclipse-workspace/Cse Java Sec1/src/labexam1/tbl_instructor", true));
			dos.writeUTF(name);
			dos.writeUTF(department);
			dos.writeBoolean(isvisitinginstructor);
			
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
			DataInputStream dis = new DataInputStream(new FileInputStream("C:/Users/asus/eclipse-workspace/Cse Java Sec1/src/labexam1/tbl_instructor"));
			System.out.println("\nName\t\tDepartment\t\tisvisitinginstructor\n------------------------------------------------------------");
			while(dis.available() != 0) {
				name = dis.readUTF();
				department=dis.readUTF();
				isvisitinginstructor=dis.readBoolean();
			
				System.out.println(name+"\t\t"+department+"\t\t\t"+isvisitinginstructor);
			}
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
