import java.util.*;
import java.io.*;

public class StudentMarksSystem{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		StudentCollection collection = new StudentCollection();

		int userInput;
		int choice = 99;

		// Reads the student data from the student.dat file
		try{
			collection.readStudentData();
		}catch(FileNotFoundException e){
			System.out.println("File Does not exists");
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
			choice = scan.nextInt();

			switch(choice){
				case 1:{
					// Add a student
					collection.addStudent();
					break;
				}
				case 2:{
					// TODO: Delete a student
					collection.deleteStudent();
					break;
				}
				case 3:{
					// TODO: Display student list
					collection.displayStudent();
					break;
				}
				default:{
					// TODO: Add some statement
				}
			}

		}

		// Write the student data to the student.dat file
		try{
			collection.writeStudentData();
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