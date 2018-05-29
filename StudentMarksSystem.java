import java.util.*;
import java.io.*;

public class StudentMarksSystem{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		StudentCollection studentCollection = new StudentCollection();
		UnitCollection unitCollection = new UnitCollection();
		MarksCollection marksCollection = new MarksCollection();

		int userInput;
		int choice = 99;

		// Reads the student data from the student.dat file
		try{
			studentCollection.readStudentData();
		}catch(FileNotFoundException e){
			System.out.println("File Does not exist");
		}

		// Reads the unit data from the unit.dat file
		try{
			unitCollection.readUnitData();
		}catch(FileNotFoundException e){
			System.out.println("File Does not exist");
		}

		// Read the marks data from the marks.dat file
		try{
			marksCollection.readMarksData();
		}catch(FileNotFoundException e){
			System.out.println("File Does not exist");
		}

		System.out.println("\n\n");
		System.out.println("---------------------");
		System.out.println("Student Marks System");
		System.out.println("---------------------");
		System.out.println("Select the choices from the menu");
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
					System.out.println("\n\n\n------------------------------------------------------------");
					System.out.println("Student ID\tName\t\tMajor\t\tNationality");
					System.out.println("------------------------------------------------------------");
					studentCollection.displayStudent();
					System.out.println("\n------------------------------------------------------------\n\n\n");
					break;
				}
				case 4:{
					// Add new unit
					unitCollection.addUnit();
					break;
				}
				case 5:{
					// Delete unit by unit number
					unitCollection.deleteUnit();
					break;
				}
				case 6:{
					// Display all the units
					System.out.println("\n\n\n-------------------------------------------");
					System.out.println("Unit No\t\tUnit Name\tUnit Credit");
					System.out.println("-------------------------------------------");
					unitCollection.displayUnit();
					System.out.println("-------------------------------------------\n\n");
					break;
				}
				case 7:{
					// Add student marks
					marksCollection.addMarks();
					break;
				}
				case 8:{
					// Delete student marks
					marksCollection.deleteMarks();
					break;
				}
				case 9:{
					// Display student marks
					System.out.println("\n\n\n------------------------------");
					System.out.println("Unit\tSID\t\tMarks");
					System.out.println("------------------------------");
					marksCollection.displayMarks();
					System.out.println("------------------------------\n\n");
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
			System.out.println("Unable to write new information.");
		}

		// Write the unit data to unit.dat file
		try{
			unitCollection.writeUnitData();
		}catch(IOException e){
			System.out.println("Unable to write new information.");
		}

		// Write the marks data to marks.dat file
		try{
			marksCollection.writeMarksData();
		}catch(IOException e){
			System.out.println("Unable to write new information");
		}
	}

	public static void menu(){
		String menu = "\n\n";
		menu += "-----------------------\n";
		menu += "MENU\n";
		menu += "-----------------------\n";
		menu += "1. Add new students\n";
		menu += "2. Delete a student\n";
		menu += "3. Display student list\n";
		menu += "4. Add new unit\n";
		menu += "5. Delete a unit\n";
		menu += "6. Display all units\n";
		menu += "7. Add Student Marks\n";
		menu += "8. Delete student marks\n";
		menu += "9. Display student marks\n";
		menu += "0. Exit.\n";
		menu += "-----------------------\n";
		menu += "Your Choice -> ";

		System.out.print(menu);
	}
}