import java.util.*;
import java.io.*;

public class StudentCollection{
	private int sid;
	private String firstName, lastName, major, nationality;

	public StudentCollection(){
	}

	Scanner scan = new Scanner(System.in);
	

	ArrayList<Student> studentList = new ArrayList<Student>();
	Student student;

	public void addStudent(){
		System.out.print("\nStudent ID: ");
		sid = scan.nextInt();

		System.out.print("\nFirst Name: ");
		scan.nextLine();
		firstName = scan.nextLine();

		System.out.print("\nLast Name: ");
		lastName = scan.nextLine();

		System.out.print("\nMajor: ");
		major = scan.nextLine();

		System.out.print("\nNationality: ");
		nationality = scan.nextLine();

		student = new Student(sid,firstName,lastName,major,nationality);
		studentList.add(student);

		System.out.println("Student added.");
	}

	public void displayStudent(){
		int idx = 0;
		while(idx < studentList.size()){
			System.out.println(studentList.get(idx));
			idx++;
		}
	}

	public void deleteStudent(){
		System.out.print("\nEnter Student ID: ");
		int student_id = scan.nextInt();
		for(int i = 0; i < studentList.size(); i++){
			if(student_id == studentList.get(i).getStudentID()){
				studentList.remove(i);
			}
		}
	}

	public void readStudentData() throws FileNotFoundException{
		String studentFile = "student.dat";
		Scanner sc = new Scanner(new File(studentFile));
		System.out.println("\n**Reading input file " + studentFile + " .. ");
		while(sc.hasNext()){
			sid = sc.nextInt();
			firstName = sc.next();
			lastName = sc.next();
			major = sc.next();
			nationality = sc.next();

			student = new Student(sid,firstName,lastName,major,nationality);
			studentList.add(student);
		}
		sc.close();
		System.out.println("Done Scanning.");
	}

	public void writeStudentData() throws IOException{
		String studentFile = "student.dat";
		PrintWriter outputFile = new PrintWriter(new FileWriter(studentFile));
		System.out.println("\n** Writing the data in the file " + studentFile + " .. ");
		int idx = 0;
		while(idx < studentList.size()){
			outputFile.println(studentList.get(idx));
			idx++;
		}
		outputFile.close();
		System.out.println("Done writing the file");
	}
}
