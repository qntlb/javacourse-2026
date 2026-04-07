/**
 * In this package we revisit the mortgage example from session 2 and improve it using a
 * private constructor: whereas in the earlier version a warning message was printed when the
 * total loan budget was exceeded, here the private constructor is called only from a public
 * static factory method that first checks whether the new loan would exceed the budget, and
 * returns null if it would. This prevents any new Mortgage objects from being created once the
 * budget limit has been reached.
 */
package javacourse.session3.privateconstructor.enhancedmortgages;
