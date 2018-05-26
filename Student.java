public class Student{
	private int studentID;
	private String studentName;
	private String studentMajor;
	private String studentNationality;

	public Student(int studentID, String studentName, String studentMajor, String studentNationality){
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentMajor = studentMajor;
		this.studentNationality = studentNationality;
	}

	public int getStudentID(){
		return studentID;
	}

	public String toString(){
		String summary = "--------------------------------\n";
		summary += "Student ID: " + studentID + "\n";
		summary += "Name: " + studentName + "\n";
		summary += "Major: " + studentMajor + "\n";
		summary += "Nationality: " + studentNationality + "\n";
		summary += "--------------------------------\n";

		return summary;
	}
}