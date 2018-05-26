public class StudentCollection{
	private Student[] collection;
	private int count;
	private int cacheCount = 0;
	private Student[] cache;

	//----------------------------------------------------
	// Constructor: Creates an initially empty collection
	//----------------------------------------------------
	public StudentCollection(){
		collection = new Student[5];
		count = 0;
		cache = new Student[cacheCount+1];
	}

	public void addStudent(int studentID,String name, String major, String nationality){
		if(count == collection.length){
			increaseSize();
		}

		collection[count] = new Student(studentID, name, major, nationality);
		count++;
	}

	//-----------------------------------------------------------
	// Method to delete student with student ID only
	//-----------------------------------------------------------
	public void deleteStudent(int student_id){
		Student[] temp = new Student[collection.length];
		int tempStudent = 0;
		int q = 0;

		for(int i = 0; i < collection.length-1; i++){
			tempStudent = collection[i].getStudentID();
			if(tempStudent == student_id){
				q = 1; 
				cache[cacheCount] = collection[i];
				cacheCount++;
				count--;
			}
			temp[i] = collection[i + q];
		}
		collection = temp;
	}

	//----------------------------------------------------------
	// TODO: Method to retrieve cached list
	//----------------------------------------------------------


	//----------------------------------------------------
	// Returns a report describing the Student Collection
	//----------------------------------------------------
	public String toString(){
		String report = "----------------------------------------------\n";
		report += "Student Information\n\n";
		report += "Number of Students: " + count + "\n\n";
		report += "Student List:\n\n";
		report += "\n";

		for(int student = 0; student < count; student++){
			report += collection[student].toString() + "\n";
		}
		return report;
	}	

	//----------------------------------------------------
	// Increases the capacity of the collection by creating
	// a larger array and copying the existing collection
	// into it.
	//----------------------------------------------------

	private void increaseSize(){
		Student[] temp = new Student[collection.length + 1];

		for(int student = 0; student < collection.length; student++){
			temp[student] = collection[student];
		}
		collection = temp;
	}
}