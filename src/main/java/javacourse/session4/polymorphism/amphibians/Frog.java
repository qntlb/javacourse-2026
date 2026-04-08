package javacourse.session4.polymorphism.amphibians;

import static javacourse.session3.useful.Print.printn;

/**
 * This class inherits from Amphibian (a frog is an amphibian) and overrides the three methods swimming(),
 * walking() and croaking().
 *
 */
public class Frog extends Amphibian{

	public Frog(){
		printn("I am a frog");
	}

	@Override
	public void swimming(){// the access modifier cannot be more restrictive than the one of the method of the base class
		printn("Frog swimming");
	}

	@Override
	public void walking(){
		printn("Frog walking");
	}

	@Override
	public void croaking(){
		printn("Frog croaking");
	}

	public void frogMethod() {
		printn("Specific frog method");
	}
}
