package javacourse.session1.testval;

/**
 * In this class we choose three values and test if the first one lies inside
 * the interval defined by the other two. We use the class Comparison.
 */
public class Testing {

	public static void main(String[] args) {

		Comparison tester = new Comparison(); // constructing an object of type Comparison

		double testedNumber = 2.7; // try with a number outside the interval
		double leftEnd = 2;
		double rightEnd = 3;

		System.out.println("The result of the test as a boolean is: "
				+ tester.isInside(testedNumber, leftEnd, rightEnd));
		// note: the method is called inside println
		
		System.out.println("\nThe result from the compact method is: "+ tester.compactIsInside(testedNumber, leftEnd, rightEnd));
		
		int isInsideAsInt = tester.isInsideAsInt(testedNumber, leftEnd, rightEnd);
		System.out.println("\nThe result of the test as an integer is: " + isInsideAsInt);
		
		// TODO: test the method isInsideWithTernary
		boolean resultWithTernary = tester.isInsideWithTernary(testedNumber, leftEnd, rightEnd);
		System.out.println("\nThe result of the test as a boolean from the ternary operator is: " + resultWithTernary);
	}
}
