package javacourse.session5.abstractclasses.basicexample;

import static javacourse.session3.useful.Print.printn;

/**
 * This class has a main method which creates an object of DerivedClassFromAbstract,
 * that extends the abstract class AbstractBaseClass, and pass it to the callMethod
 * method of OtherClass.
 * Note that this method takes as an argument an object of a class which extends
 * AbstractBaseClass: the object here gets implicitly upcasted.
 */
public class AbstractTester {
	public static void main(String[] args) {
		/*
		 * It is not possible to create objects of AbstractBaseClass! 
		 * They would not be able to call abstractMethod().
		 */
//		AbstractBaseClass abstractBase = new AbstractBaseClass();
		
		// the constructor of the base class is called
		DerivedClassFromAbstract objectOfDerivedClass = new DerivedClassFromAbstract(); 
		
		printn();
		
		objectOfDerivedClass.nonAbstractMethod(); // directly inherited
		objectOfDerivedClass.abstractMethod();

		printn();
		
		OtherClass.callMethod(objectOfDerivedClass); // implicit upcasting
		

		printn();
		objectOfDerivedClass.specificMethod();
	}
}
