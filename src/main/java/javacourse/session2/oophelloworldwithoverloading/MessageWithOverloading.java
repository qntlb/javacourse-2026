package javacourse.session2.oophelloworldwithoverloading;

/**
 * The main use of this class is to print a message. It has one field,
 * messageToBePrinted, which has a default value. There is a (default)
 * constructor, whose side effect is to let us know that a new object has been
 * created, and a constructor which takes a string as argument and sets the value
 * of messageToBePrinted equal to that String. We then have a method
 * printMessage(), which just prints the value of messageToBePrinted, and an
 * overloaded method printMessage(String messageViaMethod) which prints messageViaMethod.
 */
public class MessageWithOverloading {

	String messageToBePrinted = "Default hello message";

	// TODO: write the default constructor and the constructor with argument as in the Javadoc of the class
	MessageWithOverloading() {
		// Side effect
		System.out.println("A new default message is created.");
	}
	
	MessageWithOverloading(String message) {
		System.out.println("A new personalized message is created.");
		messageToBePrinted = message;
	}



	// TODO: write the method printMessage() and the overloaded method with argument as in the Javadoc of the class.
	void printMessage() {
		System.out.println(messageToBePrinted);
	}
	
	void printMessage(String message) {
		System.out.println(message);
	}
}
