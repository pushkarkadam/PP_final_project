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

		System.out.println("Unit added.");
	}

	// TODO: Display units from unit list
	public void displayUnit(){
		int idx = 0;
		while(idx < unitList.size()){
			System.out.println(unitList.get(idx));
			idx++;
		}
	}

	// TODO: Delete unit by unit no
	public void deleteUnit(){
		System.out.println("\nEnter Unit number: ");
		int unit_no = scan.nextInt();
		for(int i = 0; i < unitList.size(); i++){
			if(unit_no == unitList.get(i).getUnitNo()){
				unitList.remove(i);
			}
		}
	}

	// TODO: Read the data from unit.dat
	public void readUnitData() throws FileNotFoundException{
		String unitFile = "unit.dat";
		Scanner sc = new Scanner(new File(unitFile));
		System.out.println("\n**Reading input file " + unitFile + " .. ");
		while(sc.hasNext()){
			unitNo = sc.nextInt();
			unitName = sc.next();
			unitCredit = sc.nextInt();

			unit = new Unit(unitName,unitNo,unitCredit);
			unitList.add(unit);
		}
		sc.close();
		System.out.println("Scanning " + unitFile + " complete.");
	}

	//TODO: Write data to file unit.dat
	public void writeUnitData() throws IOException{
		// Add code here
	}
}