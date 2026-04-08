package javacourse.session4.inheritanceandconstructors.basicexample;

/**
 * Running this class we can see that the constructor of the parent class is
 * implicitly called when an object of the derived class is created.
 */
public class TestClass {
	public static void main(String[] args) {
		DerivedClass derived = new DerivedClass();// look at how constructors are called
	}
}
