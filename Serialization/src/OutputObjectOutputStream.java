import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputObjectOutputStream {

	public static void main(String[] args) {
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		Student student1 = new Student("Gayatri", "Jagtap", "Sangli");
		Student student2 = new Student("Gayatri", "Jagtap", "Kolhapur");
		Student student3 = new Student("Suraj", "Shinde", "Sangli");
		
		try {
			fileOutputStream = new FileOutputStream("C:\\Users\\OM\\Desktop\\example.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(student1);
			objectOutputStream.writeObject(student2);
			objectOutputStream.writeObject(student3);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fileOutputStream.close();
				objectOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("done");
		
	}
}
