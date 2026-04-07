/**
 * In this package we present the first and most direct example of encapsulation: the class
 * TravelSpeed stores a distance and a time as private fields and exposes them through public
 * getters and setters that handle a unit conversion between kilometers and miles transparently.
 * The client always works in kilometers, while the internal representation uses miles; the
 * conversion is entirely hidden, so if the internal unit were changed in the future the
 * client code would not need to be modified.
 */
package javacourse.session3.encapsulation.travelspeed;
