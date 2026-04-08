package javacourse.session2.power;

/**
 * This class gives an example of method overloading: computePower has two
 * arguments, the base and the exponent. If the exponent is an int no problem,
 * we just print the result. If the exponent is a double, we can get problems if
 * the base is negative. If we just use Math.pow, we get NaN. Then we want to
 * warn the user if this is the case. So we distinguish the two types of
 * implementation (the one when the exponent is int and the one when the
 * exponent is double) by Overloading.
 */
public class Power {

	double result; // only definition, not initialization

	
	/**
	 * It computes and prints base to the power of exponent, when exponent is
	 * integer, so there are no problems if base is negative.
	 *
	 * @param base
	 * @param exponent
	 */
	void computePower(double base, int exponent) {
		result = Math.pow(base, exponent);
		System.out.println("Computing " + base + " to the power of " + exponent + " using the simple method. The result is " + result);
	}

	/**
	 * It computes and prints base to the power of exponent, when exponent is
	 * double, giving a warning if the base is negative and exponent is a double.
	 *
	 * @param base
	 * @param exponent
	 */
	void computePower(double base, double exponent) {
		if (base >= 0 || exponent == Math.floor(exponent)) {
			result = Math.pow(base, exponent);
			System.out.println("Computing " + base + " to the power of " + exponent + " using the overloaded method. The result is " + result);
		}
		else {
			System.out.println("The result is a complex number, is that what you want?");
		}
	}

	
}