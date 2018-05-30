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
	public void displayMarks(){
		int idx = 0;
		while(idx < marksList.size()){
			System.out.println(marksList.get(idx));
			idx++;
		}
	}

	// TODO: Display marks by student ID
	public void displayMarksByStudentID(){
		ArrayList<Marks> outputMarks = new ArrayList<Marks>();
		System.out.print("\nEnter student ID: ");
		int student_id = scan.nextInt();
		int idx = 0;

		for(int i=0; i<marksList.size();i++){
			if(student_id == marksList.get(i).getStudentID()){
				outputMarks.add(marksList.get(i));
			}
		}

		if(outputMarks.isEmpty()){
			System.out.println("\nInvalid Input");
		}else{
			System.out.println("\n\n\n------------------------------");
			System.out.println("Unit\tSID\t\tMarks");
			System.out.println("------------------------------");
			while(idx < outputMarks.size()){
				System.out.println(outputMarks.get(idx));
				idx++;
			}
			System.out.println("------------------------------\n\n");
		}
	}

	// TODO: Display marks by unit number
	public void displayMarksByUnitNo(){
		ArrayList<Marks> unitMarks = new ArrayList<Marks>();
		System.out.print("\nEnter Unit number: ");
		int unit_no = scan.nextInt();
		int idx = 0;

		for (int i=0; i<marksList.size(); i++){
			if(unit_no == marksList.get(i).getUnitNo()){
				unitMarks.add(marksList.get(i));
			}
		}
		if(unitMarks.isEmpty()){
			System.out.println("\nInvalid Input");
		}else{
			System.out.println("\n\n\n------------------------------");
			System.out.println("Unit\tSID\t\tMarks");
			System.out.println("------------------------------");
			while(idx < unitMarks.size()){
				System.out.println(unitMarks.get(idx));
				idx++;
			}
			System.out.println("------------------------------\n\n");
		}
	}

	// TODO: Delete marks by student ID
	public void deleteMarks(){
		System.out.print("\nEnter student ID: ");
		int student_id = scan.nextInt();
		boolean flag = true;

		System.out.print("\nEnter unit number: ");
		int unit_no = scan.nextInt();

		for(int i=0; i < marksList.size(); i++){
			if(student_id == marksList.get(i).getStudentID() && unit_no == marksList.get(i).getUnitNo()){
				marksList.remove(i);
				flag = false;
			}
		}
		if(flag){
			System.out.println("Incorrect Information");
		}
	}

	// TODO: Read the data from marks.dat file
	public void readMarksData() throws FileNotFoundException{
		String marksFile = "marks.dat";
		Scanner sc = new Scanner(new File(marksFile));
		System.out.println("\n**Reading input file " + marksFile + " .. ");
		while(sc.hasNext()){
			unitNo = sc.nextInt();
			studentID = sc.nextInt();
			unitMarks = sc.nextInt();

			marks = new Marks(unitNo,studentID,unitMarks);
			marksList.add(marks);
		}
		sc.close();
		System.out.println("Scanning " + marksFile + " complete");
	}

	//TODO: Write data to file marks.dat
	public void writeMarksData() throws IOException{
		String marksFile = "marks.dat";
		PrintWriter marksOutputFile = new PrintWriter(new FileWriter(marksFile));
		System.out.println("\n** Writing the data in the file " + marksFile + " .. ");
		int idx = 0;
		while(idx < marksList.size()){
			marksOutputFile.println(marksList.get(idx));
			idx++;
		}
		marksOutputFile.close();
		System.out.println("Writing " + marksFile + " complete.");
	}
}