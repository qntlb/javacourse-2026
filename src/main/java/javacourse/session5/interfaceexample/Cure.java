package javacourse.session5.interfaceexample;

/**
 * This interface has two methods: diagnose() and cure(). They have to be implemented by whatever
 * class implementing this interface.
 */
public interface Cure {
	int field = 10; // it is implicitly static and final (does not make sense here, just to show)

	// these methods are implicitly public
	void diagnose();
	void heal();
	
	private static void privateMethod() {
		System.out.println("Hey");
	}
	
	static void staticMethod() {
		System.out.println("I am a static method of the interface");
		privateMethod();
	}
}
