package labexam1;
import java.io.*;


public class Clerk extends PersonforCLREK {
	double salary;
	public void ClerkInfo() {
		System.out.println("Enter Clerk's Information");
		super.addNew();
		System.out.print("Salary: ");
		salary = input.nextDouble();
		insert();
	}
	@Override
	public void insert() {
		try {
			FileOutputStream fille = new FileOutputStream("C:/Users/asus/eclipse-workspace/Cse Java Sec1/src/labexam1/tbl_clerk", true);
			BufferedOutputStream buff=new BufferedOutputStream(fille);
			String s= "\n "+email+"\t\t "+phone+"\t\t "+salary+"\n";
			System.out.println(s);
			byte b[]=s.getBytes();
			buff.write(b);
			System.out.println("success");
			buff.flush();
			buff.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void showAll() {
		try {
			FileInputStream dis = new FileInputStream("C:/Users/asus/eclipse-workspace/Cse Java Sec1/src/labexam1/tbl_clerk");
			BufferedInputStream buf=new BufferedInputStream(dis);
			int i;
			System.out.println("\nName\t\tEmail\t\t\t\tPhone\t\tSalary\n---------------------------------------------------------------");

			while((i=buf.read())!=-1){
				System.out.print((char)i);
			}
			buf.close();
			dis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}