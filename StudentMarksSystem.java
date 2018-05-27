import java.util.*;
import java.io.*;

public class StudentMarksSystem{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		StudentCollection studentCollection = new StudentCollection();

		int userInput;
		int choice = 99;

		// Reads the student data from the student.dat file
		try{
			studentCollection.readStudentData();
		}catch(FileNotFoundException e){
			System.out.println("File Does not exist");
		}

		System.out.println("\n\n");
		System.out.println("---------------------");
		System.out.println("Student Marks System");
		System.out.println("---------------------");
		System.out.println("Select the choices from the menu");
		System.out.println("---------------------");
		System.out.println("MENU");
		//menu();
		System.out.println("---------------------");

		while(choice != 0){
			menu();
			try{
				choice = scan.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Invalid input. Please try again.");
				scan.next(); // Consumes the invalid token
			}
			

			switch(choice){
				case 1:{
					// Add a student
					studentCollection.addStudent();
					break;
				}
				case 2:{
					// Delete a student
					studentCollection.deleteStudent();
					break;
				}
				case 3:{
					// Display student list
					studentCollection.displayStudent();
					break;
				}
				default:{
					// TODO: Add some statement
				}
			}

		}

		// Write the student data to the student.dat file
		try{
			studentCollection.writeStudentData();
		}catch(IOException e){
			System.out.println("Unable to write new information");
		}
	}

	public static void menu(){
		String menu = "";
		menu += "1. Add new students.\n";
		menu += "2. Delete a student.\n";
		menu += "3. Display student list.\n";
		menu += "0. Exit.\n";
		menu += "Your Choice -> ";

		System.out.print(menu);
	}
}