import java.util.*;
import java.io.*;

public class StudentMarksSystem{
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		
		StudentCollection studentCollection = new StudentCollection();
		UnitCollection unitCollection = new UnitCollection();
		MarksCollection marksCollection = new MarksCollection();
		Menu menu = new Menu();

		int userInput;
		int choice = 99;
		int secondChoice = 99;

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
			menu.menu();
			try{
				choice = scan.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Invalid input. Please try again.");
				scan.next(); // Consumes the invalid token
			}
			

			switch(choice){
				case 1:{
					//Create Student Methods
					while(secondChoice != 0){
						menu.studentMenu();
						try{
							secondChoice = scan.nextInt();
						}catch(InputMismatchException e){
							System.out.println("Invalid input. Please try again.");
							scan.next();
						}

						switch(secondChoice){
							case 1:{
								// Add student
								studentCollection.addStudent();
								break;
							}
							case 2:{
								// Delete student
								studentCollection.deleteStudent();
								break;
							}
							case 3: {
								// Display all students
								System.out.println("\n\n\n------------------------------------------------------------");
								System.out.println("Student ID\tName\t\tMajor\t\tNationality");
								System.out.println("------------------------------------------------------------");
								studentCollection.displayStudent();
								System.out.println("\n------------------------------------------------------------\n\n\n");
								break;
							}
							default:{
								// TODO: Add statements
							}
						}
					}
					 // Reassigning secondChoice with a high value for further execution
					secondChoice = 99;
					break;
				}
				case 2:{
					// Create Unit methods
					while(secondChoice != 0){
						menu.unitMenu();
						try{
							secondChoice = scan.nextInt();
						}catch(InputMismatchException e){
							System.out.println("Invalid input. Please try again.");
							scan.next();
						}

						switch(secondChoice){
							case 1:{
								// Add unit
								unitCollection.addUnit();
								break;
							}
							case 2:{
								// Delete unit
								unitCollection.deleteUnit();
								break;
							}
							case 3: {
								// Display all units
								System.out.println("\n\n\n-------------------------------------------");
								System.out.println("Unit No\t\tUnit Name\tUnit Credit");
								System.out.println("-------------------------------------------");
								unitCollection.displayUnit();
								System.out.println("-------------------------------------------\n\n");
								break;
							}
							default:{
							}
						}
					}
					 // Reassigning secondChoice with a high value for further execution
					secondChoice = 99;
					break;
				}
				case 3:{
					// Create marks methods
					while(secondChoice != 0){
						menu.marksMenu();
						try{
							secondChoice = scan.nextInt();
						}catch(InputMismatchException e){
							System.out.println("Invalid input. Please try again.");
							scan.next();
						}

						switch(secondChoice){
							case 1:{
								// Add marks
								marksCollection.addMarks();
								break;
							}
							case 2:{
								// Delete marks
								marksCollection.deleteMarks();
								break;
							}
							case 3:{
								// Display all marks
								System.out.println("\n\n\n------------------------------");
								System.out.println("Unit\tSID\t\tMarks");
								System.out.println("------------------------------");
								marksCollection.displayMarks();
								System.out.println("------------------------------\n\n");
								break;
							}

							case 4:{
								// Display marks by student ID
								marksCollection.displayMarksByStudentID();
								break;
							}
							case 5:{
								// Display marks by unit number
								marksCollection.displayMarksByUnitNo();
								break;
							}
							default:{
							}
						}
					}
					 // Reassigning secondChoice with a high value for further execution
					secondChoice = 99;
					break;
				}
				default:{
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
}