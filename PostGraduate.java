
public class PostGraduate extends Graduate {
	
	public PostGraduate(String name, String major, int units) {
		super(name, major, units);
	}//end three argument constructor

	public int calculateTuition() {
		return getUnits() * 750;
	}//end method
}//end class
