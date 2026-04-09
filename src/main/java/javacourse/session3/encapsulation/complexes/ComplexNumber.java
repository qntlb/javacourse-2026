package javacourse.session3.encapsulation.complexes;

import static javacourse.session3.useful.Print.print;
import static javacourse.session3.useful.Print.printn;

/**
 * This class illustrates some uses of Encapsulation and some of the things we have seen so far.
 * We want to perform operations with complex numbers for an user who only understands Cartesian coordinates.
 * However, we think that some of the operations are more easily implemented by using the Polar representation.
 * We then work with polar coordinates, hiding the conversions from Cartesian to polar coordinates and vice-versa.
 */

public class ComplexNumber {

	/*
	 * There is no need for the user to directly access these fields; not only, the user does not even
	 * know their meaning
	 */
	private double r;
	private double theta;

	/*
	 * Private constructor! Does not have to be known by the front end user, it just gets called from inside the class
	 * when we want to construct an object of this type (i.e., with polar coordinates) from the cartesian coordinates
	 * the user gives.
	 */
	private ComplexNumber(double r, double theta) { //Constructor for internal use
		this.r=r;
		this.theta=theta;
	}

	/*
	 * Setter: the user only understands Cartesian representation. However, these coordinates
	 * are then immediately converted into polar ones, and an object representing a complex number
	 * in polar coordinates is returned.  
	 */
	/**
	 * It returns a complex number from Cartesian coordinates
	 * @param realPart
	 * @param imaginaryPart
	 * @return an object representing the complex number
	 */
	/*
	 * TODO: write the public static method setComplexNumber which returns a ComplexNumber with the correct initialization.
	 * Look at the class with the main to have a hint about the input types.
	 * The function Math.atan2 can be useful, look for the documentation to see how to use it.
	 */
	public static ComplexNumber setComplexNumber(double realPart, double imaginaryPart) {
		double radius = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
		double angle = Math.atan2(imaginaryPart, realPart);
		return new ComplexNumber(radius, angle);
	}

	/*
	 * We translate from the polar coordinates of the object which is calling the method to cartesian ones
	 * (in order to give back the coordinates that the user knows or in order to perform operations which
	 * are simpler in cartesian coordinates). These methods are public because maybe the user wants to 
	 * get the real and imaginary part of a complex number. However, they can also be used internally.
	 */
	/**
	 * It returns the real part of a complex number
	 * @return the real part of the complex number
	 */
	/*
	 * TODO: write the method getRealPart().
	 */
	public double getRealPart() {
		return r * Math.cos(theta);
	}

	/**
	 * It returns the imaginary part of a complex number
	 * @return the imaginary part of the complex number
	 */
	/*
	 * TODO: write the method getImaginaryPart().
	 */
	public double getImaginaryPart() {
		return r * Math.sin(theta);
	}


	/*
	 * Some operations are easier when expressed in polar coordinates.
	 */
	/**
	 * @return the absolute value of the complex number represented by the object calling the method
	 */
	// TODO: write the method abs()
	public double abs() {
		return r;
	}
	
	/**
	 * @return the conjugate of the complex number represented by the object calling the method
	 */
	// TODO: write the method conjugate() -> ComplexNumber
	public ComplexNumber conjugate() {
		ComplexNumber conjugate = new ComplexNumber(r, - theta);  
		return conjugate;
		// or, more compactly:
		// return new ComplexNumber(r, - theta);
	}

	/*
	 * summing complex numbers is still easier in cartesian coordinates
	 */
	/**
	 * @param c complex number
	 * @return the sum of the complex number represented by the object calling the method and the complex number
	 * given as an argument
	 */
	/*
	 * TODO: write the method sum(ComplexNumber complexNumber)
	 */
	public ComplexNumber sum(ComplexNumber complexNumber) {
		double realPartThis = getRealPart();
		double imaginaryPartThis = getImaginaryPart();
		
		double realPartOther = complexNumber.getRealPart();
		double imaginaryPartOther = complexNumber.getImaginaryPart();
		
		double realPartSum = realPartThis + realPartOther;
		double imaginaryPartSum = imaginaryPartThis + imaginaryPartOther;
		
		ComplexNumber sum = setComplexNumber(realPartSum, imaginaryPartSum);
		return sum;
	}
	
	// The method can be written in a more compact form:
	public ComplexNumber sumCompact(ComplexNumber complexNumber) {
		return setComplexNumber(getRealPart() + complexNumber.getRealPart(), getImaginaryPart() + complexNumber.getImaginaryPart());
	}

	/*
	 * the product is more efficiently computed in polar coordinates.
	 */
	/**
	 * @param complexNumber complex number in cartesian coordinates
	 * @return the product of complexNumber and the complex number represented by the object calling the method
	 */
	/*
	 * TODO: write the method product(ComplexNumber complexNumber)
	 */
	public ComplexNumber product(ComplexNumber complexNumber) {
		double radiusProduct = r * complexNumber.r;
		double angleProduct = theta + complexNumber.theta;
		
		ComplexNumber product = new ComplexNumber(radiusProduct, angleProduct);
		return product;
	}

	/*
	 * it returns the sign of the imaginary part of the complex number represented by the object
	 * calling the method
	 */
	private String imaginarySign() {
		return (getImaginaryPart() >= 0) ?  "+ ": "- ";
	}


	/*
	 * Here we have methods that the user calls in order to visualize the complex number
	 * in cartesian coordinates. 
	 */
	/**
	 * prints a complex number in cartesian coordinates
	 */
	public void show(){//a + b i
		if (getImaginaryPart() !=0.0){
			print(getRealPart() + " " + imaginarySign() //gets the right sign before the imaginary unit
			+ Math.abs(getImaginaryPart()) + " i ");
		}
		else {
			print(getRealPart()); //removes "i 0"
		}
	}


	/**
	 * prints a complex number in cartesian coordinates followed by new line
	 */
	public void showWithNewLine(){
		if (getImaginaryPart() !=0.0){
			printn(getRealPart() + " " + imaginarySign() //gets the right sign before the imaginary unit
			+ Math.abs(getImaginaryPart())+ " i ");
		}
		else {
			printn(getRealPart()); //removes "i 0"
		}
	}
}


