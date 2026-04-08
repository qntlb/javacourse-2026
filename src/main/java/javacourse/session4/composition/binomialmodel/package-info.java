/**
 * In this package we apply composition to a financial simulation: the class BinomialModelSimulator
 * contains an object of type LinearCongruentialGenerator (from session 3) as a field, and delegates
 * to it the generation of the random numbers needed to simulate the up and down movements of the
 * process. The simulation itself uses lazy initialization, private generation methods, and public
 * accessor methods that return rows, columns and averages of the simulated path matrix.
 */
package javacourse.session4.composition.binomialmodel;
