import java.util.*;

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
}
