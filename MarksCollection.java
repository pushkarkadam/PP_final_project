import java.util.*;
import java.io.*;

public class MarksCollection{
	private int unitNo, studentID, unitMarks;

	public MarksCollection(){
	}

	Scanner scan = new Scanner(System.in);

	ArrayList<Marks> marksList = new ArrayList<Marks>();
	Marks marks;

	// TODO: Add marks to the marks list
	public void addMarks(){
		System.out.print("\nUnit Number: ");
		unitNo = scan.nextInt();

		System.out.print("\nStudent ID: ");
		studentID = scan.nextInt();

		System.out.print("\nMarks: ");
		unitMarks = scan.nextInt();

		marks = new Marks(unitNo, studentID, unitMarks);

		marksList.add(marks);

		System.out.println("Marks added");
	}

	// TODO: Display marks from marks list
	public void diplayMarks(){
		int idx = 0;
		while(idx < marksList.size()){
			System.out.println(marksList.get(idx));
			idx++;
		}
	}

	// TODO: Delete marks by student ID
	public void deleteMarks(){
		System.out.print("\nEnter student ID: ");
		int student_id = scan.nextInt();

		System.out.print("\nEnter unit number: ");
		int unit_no = scan.nextInt();

		for(int i=0; i < marksList.size(); i++){
			if(student_id == marksList.get(i).getStudentID() && unit_no == marksList.get(i).getUnitNo()){
				marksList.remove(i);
			}
		}
	}

	// TODO: Read the data from marks.dat file
	public void readMarksData(){
		// Add code here
	}

	//TODO: Write data to file marks.dat
	public void writeMarksData(){
		// Add code here
	}
}