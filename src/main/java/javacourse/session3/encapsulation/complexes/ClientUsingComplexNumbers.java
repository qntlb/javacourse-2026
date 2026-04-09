package javacourse.session3.encapsulation.complexes;

import static javacourse.session3.useful.Print.print;
import static javacourse.session3.useful.Print.printn;

/**
 * This class tests the classes ComplexPolar and ComplexCartesian.
 */

public class ClientUsingComplexNumbers {
	public static void main(String[] args) {

		//note: we can not use the (private!) constructor
		ComplexNumber complexNumber = ComplexNumber.setComplexNumber(3.0, 4.0);
		System.out.println(complexNumber); //not that nice
		System.out.println();
		
		// The complex number is created and its coordinate are stored as polar coordinates
		// We can visualize the cartesian coordinates of the complex number using the getters
		System.out.println("The real part of the complex number is " + complexNumber.getRealPart());

		//prints
		complexNumber.showWithNewLine();

		//we compute and print the absolute value
		print("The absolute value of ");
		complexNumber.show();
		printn(" is " + complexNumber.abs());

		//we compute and print the conjugate
		ComplexNumber conjugate = complexNumber.conjugate();
		print("The conjugate of ");
		complexNumber.show();
		print(" is ");
		conjugate.showWithNewLine();


		//we compute and print the product with the conjugate
		ComplexNumber product = complexNumber.product(conjugate);
		print("The product of ");
		complexNumber.show();
		print( " by its conjugate is ");
		product.showWithNewLine();

		
		ComplexNumber newComplexNumber = ComplexNumber.setComplexNumber(1.0, 2.0);
		
		// we compute and print the sum of the two complex numbers
		print("The sum of ");
		complexNumber.show();
		print("and ");
		newComplexNumber.show();
		print( " is ");
		//another way to do that: multiple calls
		complexNumber.sum(newComplexNumber).showWithNewLine();


	}
}
