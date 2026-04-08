package javacourse.session4.composition.car;

import static javacourse.session3.useful.Print.printn;

/**
 * This class has one only method, start(). This is also a method of the class
 * Car, which delegates its implementation to this class.
 *
 */
public class Engine {
	
	private int horsePower;
	
	Engine(int horsePower) {
		this.horsePower = horsePower;
	}
	
	
	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}


	public void startEngine() { // starts the engine
		printn("Engine starts (thus starting the car)");
	}
}
