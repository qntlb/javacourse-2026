/**
 * In this package we illustrate lazy initialization through a linear congruential random
 * number generator: the sequence of pseudo-random numbers is generated only the first time
 * a public method requests it, and not again on subsequent calls. This is achieved by making
 * the generation method and the sequence itself private, and by checking at each public call
 * whether the sequence has already been initialized. The package also introduces the long
 * primitive type, which stores integers over a wider range than int.
 */
package javacourse.session3.encapsulation.lazyinitialization;
