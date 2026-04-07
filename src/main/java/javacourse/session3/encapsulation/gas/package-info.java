/**
 * In this package we apply encapsulation to a gas model to illustrate the use of getters and
 * setters for unit conversion: the class Gas works internally with temperatures in Kelvin, but
 * exposes a public interface in degrees Fahrenheit for a client who only understands that scale.
 * The conversion methods are private because the client has no need to see them. This shows how
 * encapsulation allows an implementation detail to be changed on the backstage without affecting
 * the code of the client.
 */
package javacourse.session3.encapsulation.gas;
