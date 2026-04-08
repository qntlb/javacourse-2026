/**
 * In this package we introduce polymorphism and late binding through an amphibian example.
 * The classes Frog and Toad both extend Amphibian and override its three methods. The static
 * method action(Amphibian) accepts any Amphibian reference and calls the three methods on it:
 * at compile time Java only sees the Amphibian type, but at run time it dispatches to the
 * correct overriding implementation depending on the actual type of the object. This behavior
 * is known as late binding and is the mechanism underlying polymorphism in Java.
 */
package javacourse.session4.polymorphism.amphibians;
