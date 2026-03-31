/**
 * In this package we revisit the divisibility check by adding a constructor that takes the
 * dividend and the divisor as arguments. This serves as an example of how the keyword this
 * is used to resolve name clashes between constructor parameters and fields of the same name:
 * writing this.dividend = dividend makes it clear that the left-hand side refers to the field
 * and the right-hand side refers to the parameter.
 */
package javacourse.session2.divisiblewithconstructor;
