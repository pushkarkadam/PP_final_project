import java.util.*;
import java.io.*;

public class UnitCollection{
	private int unitNo;
	private String unitName;
	private int unitCredit;

	public UnitCollection(){
	}

	Scanner scan = new Scanner(System.in);

	ArrayList<Unit> unitList = new ArrayList<Unit>();
	Unit unit;

	// TODO: Add unit to unit list
	public void addUnit(){
		System.out.print("\nUnit No: ");
		unitNo = scan.nextInt();

		System.out.print("\nUnit Name: ");
		scan.nextLine();
		unitName = scan.nextLine();

		System.out.print("\n");
		unitCredit = scan.nextInt();

		unit = new Unit(unitName, unitNo, unitCredit);
		unitList.add(unit);

		System.out.println("Unit added");
	}

	// TODO: Display units from unit list
	public void displayUnit(){
		// Add code here
	}

	// TODO: Delete unit by unit no
	public void deleteUnit(){
		// Add code here
	}

	// TODO: Read the data from unit.dat
	public void readUnitData() throws FileNotFoundException{
		// Add code here
	}

	//TODO: Write data to file unit.dat
	public void writeUnitData() throws IOException{
		// Add code here
	}
}