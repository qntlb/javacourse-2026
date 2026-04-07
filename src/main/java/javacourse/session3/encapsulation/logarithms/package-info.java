/**
 * In this package we use encapsulation to protect the user from passing invalid inputs:
 * the class LogarithmCalculator stores the number whose logarithm is to be computed as a
 * private field, so that it can only be set through a public setter that checks whether
 * the value is positive. If a non-positive value is given, a default value of 1 is used
 * instead. This illustrates how making a field private and providing a controlled setter
 * reduces the responsibilities placed on the user of the class.
 */
package javacourse.session3.encapsulation.logarithms;
