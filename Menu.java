public class Menu{

	public Menu(){
	}
	// TODO: Add main menu
	public void menu(){
		String menu = "\n\n";
		menu += "-----------------------\n";
		menu += "MENU\n";
		menu += "-----------------------\n";
		menu += "1. Students\n";
		menu += "2. Units\n";
		menu += "3. Marks\n";
		menu += "0. Exit.\n";
		menu += "-----------------------\n";
		menu += "Your Choice -> ";

		System.out.print(menu);
	}

	// TODO: Add student sub-menu
	public void studentMenu(){
		String studentMenu = "\n\n";
		studentMenu += "-------------------------\n";
		studentMenu += "Student Menu\n";
		studentMenu += "-------------------------\n";
		studentMenu += "1. Add a new student\n";
		studentMenu += "2. Delete a student\n";
		studentMenu += "3. Display all students\n";
		studentMenu += "0. Return to main menu\n";
		studentMenu += "-------------------------\n";
		studentMenu += "Your Choice -> ";

		System.out.print(studentMenu);

	}

	// TODO: Add unit sub-menu
	public void unitMenu(){
		String unitMenu = "\n\n";
		unitMenu += "-------------------------\n";
		unitMenu += "Unit Menu\n";
		unitMenu += "-------------------------\n";
		unitMenu += "1. Add new unit\n";
		unitMenu += "2. Delete a unit\n";
		unitMenu += "3. Display all units\n";
		unitMenu += "0. Return to main menu\n";
		unitMenu += "-------------------------\n";
		unitMenu += "Your Choice -> ";

		System.out.print(unitMenu);
	}

	// TODO: Add marks sub-menu
	public void marksMenu(){
		String marksMenu = "\n\n";
		marksMenu += "-------------------------\n";
		marksMenu += "Marks Menu\n";
		marksMenu += "-------------------------\n";
		marksMenu += "1. Add student marks\n";
		marksMenu += "2. Delete student marks\n";
		marksMenu += "3. Display student marks\n";
		marksMenu += "4. Display student marks by ID\n";
		marksMenu += "5. Display marks by unit number\n";
		marksMenu += "0. Return to main menu\n";
		marksMenu += "-------------------------\n";
		marksMenu += "Your Choice -> ";

		System.out.print(marksMenu);
	}
}