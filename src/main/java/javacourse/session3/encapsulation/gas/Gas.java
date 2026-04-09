package javacourse.session3.encapsulation.gas;

import static javacourse.session3.useful.Print.printn;

/**
 * This class shows the use of encapsulation in order to manage access control:
 * imagine we have an American client who only understands degrees Fahrenheit.
 * However, we work with Kelvin. We have therefore to let him/her give and read
 * degrees Fahrenheit, through public getters and setters, and then perform a
 * conversion from Fahrenheit to Kelvin, and vice versa. These methods to
 * perform conversions should be private: the client is only interested in
 * Fahrenheit.
 *
 */
public class Gas {

	private double temperatureKelvin; // it should be Kelvin: private, the client does not see it
	private double pressure; // Pascal
	
	private final static double gayLussacConstant = 8.3145; // final keyword: the value of this field cannot be modified

	/*
	 * TODO: write the private method kelvinToFahreneit recalling the formula
	 * F = C * 9/5 + 32, where F is Fahreneit and C is celsius. Also remember that C = K - 273.15
	 */
	private double kelvinToFahreneit(double temperatureInKelvin) {
		return (temperatureInKelvin - 273.15) * 9 / 5 + 32;
	}

	/*
	 * TODO: write the private method fahreneitToKelvin
	 */
	private double fahreneitToKelvin(double temperatureInFahreneit) {
		return (temperatureInFahreneit - 32) * 5 / 9 + 273.15;
	}

	/*
	 * getter of the temperature: the conversion from Kelvin to Fahreneit has to be
	 * performed (we work with Kelvin, the client wants to read Fahreneit)
	 */
	public double getTemperature() {
		// TODO: implement the method
		return kelvinToFahreneit(temperatureKelvin);
	}

	/*
	 * setter of the temperature: the conversion from Fahreneit to Kelvin has to be
	 * performed (we work with Kelvin, the client wants to set Fahreneit)
	 */
	public void setTemperature(double temperature) {
		// TODO: implement the method so that a message with the new temperature in Kelvin is printed
		temperatureKelvin = fahreneitToKelvin(temperature);
		System.out.println("The user set a temperature of " + temperatureKelvin + " Kelvin.");
	}

	// Calculates pressure- Gay Lussac Law. The temperature has to be in Kelvin
	private void calculatePressure() {
		pressure = temperatureKelvin * gayLussacConstant;
	}

	// getter of the pressure: of course public
	public double getPressure() {
		calculatePressure();
		// we could also write:
		// double pressure = temperatureKelvin * gayLussacConstant;
		return pressure;
	}
}
