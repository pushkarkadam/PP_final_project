public class Marks{
	private int unitNo;
	private int studentID;
	private int marks;

	public Marks(int unitNo, int studentID, int marks){
		this.unitNo = unitNo;
		this.studentID = studentID;
		this.marks = marks;
	}

	public int getUnitNo(){
		return unitNo;
	}

	public int getStudentID(){
		return studentID;
	}

	public int getMarks(){
		return marks;
	}

	public String toString(){
		String summary = "";
		summary += unitNo + "\t";
		summary += studentID + "\t";
		summary += marks;

		return summary;
	}
}