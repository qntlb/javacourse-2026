/**
 * In this package we apply encapsulation to complex number arithmetic: the class ComplexNumber
 * stores numbers internally in polar coordinates (radius and angle), which simplifies operations
 * such as product and conjugate, while exposing only a Cartesian interface (real and imaginary
 * parts) to the user. The conversion between representations is handled transparently by private
 * methods and a private constructor, so the user is never required to know about polar coordinates.
 */
package javacourse.session3.encapsulation.complexes;
