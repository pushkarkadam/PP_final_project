public class Unit{
	private String unitName;
	private int unitNo;
	private int unitCredit;

	public Unit(String unitName, int unitNo, int unitCredit){
		this.unitName = unitName;
		this.unitNo = unitNo;
		this.unitCredit = unitCredit;
	}

	public String getUnitName(){
		return unitName;
	}

	public void setUnitName(String name){
		unitName = name;
	}

	public int getUnitNo(){
		return unitNo;
	}

	public void setUnitNo(int number){
		unitNo = number;
	}

	public int getUnitCredit(){
		return unitCredit;
	}

	public void setUnitCredit(int credit){
		unitCredit = credit;
	}

	public String toString(){
		String summary = "";
		summary += unitNo + "\t";
		summary += unitName + "\t";
		summary += unitCredit;

		return summary;
	}
}