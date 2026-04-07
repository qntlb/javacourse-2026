/**
 * In this package we illustrate the use of a private constructor to restrict object creation:
 * the class PrivateConstructorClass has a private constructor that cannot be called from outside
 * the class. Instead, a public static factory method createOneObject() calls the constructor
 * internally, but only if no object of the class has been created yet. This pattern shows how
 * combining a private constructor with a static counter field gives complete control over how
 * many instances of a class can exist.
 */
package javacourse.session3.privateconstructor.countingObjects;
