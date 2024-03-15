
public class UnderGrad extends Student {
	public UnderGrad(String name, String major, int units) {
		super(name, major, units);
	}//end three argument constructor

	public int calculateTuition() {
		return getUnits() * 250;
	}//calculate tuition
}//end class
