/**
 * In this package we illustrate method overloading applied to the computation of the cosine
 * function. The method calculateCosine is overloaded with a double version and an int version:
 * when the angle in radians is a multiple of Pi, the double version delegates to the int
 * version, which can compute the result exactly without floating-point errors. This shows
 * how overloading can be used to select a more specialized and accurate implementation
 * depending on the type of the input.
 */
package javacourse.session2.cosine;
