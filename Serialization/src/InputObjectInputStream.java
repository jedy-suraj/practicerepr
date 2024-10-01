import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class InputObjectInputStream {

	public static void main(String[] args) {
		
		FileInputStream fileInputStream=null;
		ObjectInputStream objectInputStream=null;
		
		
		try {
			fileInputStream = new FileInputStream("C:\\Users\\OM\\Desktop\\example.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			Student student = (Student)objectInputStream.readObject();
			
			
			System.out.println(student.getStudfName());
			System.out.println(student.getStudlName());
			System.out.println(student.getStudCity());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fileInputStream.close();
				objectInputStream.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					}
	}
}

