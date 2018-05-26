public class Student{
	private int studentID;
	private String studentFirstName;
	private String studentLastName;
	private String studentMajor;
	private String studentNationality;

	public Student(int studentID, String studentFirstName, String studentLastName, String studentMajor, String studentNationality){
		this.studentID = studentID;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentMajor = studentMajor;
		this.studentNationality = studentNationality;
	}

	public int getStudentID(){
		return studentID;
	}

	public String toString(){
		String summary = "";
		summary += studentID + "\t";
		summary += studentFirstName + "\t";
		summary += studentLastName + "\t";
		summary += studentMajor + "\t";
		summary += studentNationality;

		return summary;
	}
}