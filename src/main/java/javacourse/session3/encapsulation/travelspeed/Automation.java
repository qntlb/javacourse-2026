package javacourse.session3.encapsulation.travelspeed;

public class Automation {
	
	private double firstField;
	private int secondField;
	
	public double getFirstField() {
		return firstField;
	}
	
	public int getSecondField() {
		return secondField;
	}
	
	/**
	 * This method allows to set a value for the field firstField.
	 * @param firstField double
	 */
	public void setFirstField(double firstField) {
		this.firstField = firstField;
	}
	
	/**
	 * Setter for secondField which can be accessed only from inside the package.
	 * @param secondField
	 */
	void setSecondField(int secondField) {
		this.secondField = secondField;
	}
	
	// Eclipse provides tools to automatically generate setters and getters.
}
