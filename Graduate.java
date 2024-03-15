
public class Graduate extends Student{
	
	public Graduate(String name, String major, int units) {
		super(name, major, units);
	}//end three argument constructor

	public int calculateTuition() {
		return getUnits() * 500;
	}//end method
}//end class
