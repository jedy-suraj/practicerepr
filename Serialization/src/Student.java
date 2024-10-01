import java.io.Serializable;

public class Student implements Serializable{
	
	@Override
	public String toString() {
		return "Student [studfName=" + studfName + ", studlName=" + studlName + ", studCity=" + studCity + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String studfName;
	private String studlName;
	private  String studCity;
	
	public Student(String studfName, String studlName, String studCity) {
		this.studfName = studfName;
		this.studlName = studlName;
		this.studCity = studCity;
	}
	
	public String getStudCity() {
		return studCity;
	}
	
	public String getStudfName() {
		return studfName;
	}
	
	public String getStudlName() {
		return studlName;
	}
}
