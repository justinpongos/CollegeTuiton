
public abstract class Student {
	private String name;
	private String major;
	private int units;
	
	public Student(String name, String major, int units) {
		this.name = name;
		this.major = major;
		this.units = units;
	}//end three argument constructor
	
	public String getName() {
		return name;
	}///end name getter
	
	public void setName(String name) {
		this.name = name;
	}//end name setter
	
	public String getMajor() {
		return major;
	}//end major getter
	
	public void setMajor(String major) {
		this.major = major;
	}//end major setter
	
	public int getUnits() {
		return units;
	}//end units getter
	
	public void setUnits(int units) {
		this.units = units;
	}//end units setter
	
	public abstract int calculateTuition();
	
	public String toString() {
		String output;
		output = "Name: " + name + " | Major: " + major + " | Units: " + units + " | Tuition: " + calculateTuition();
		return output;
	}//end toString
}//end class
