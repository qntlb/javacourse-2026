/**
 * In this package we illustrate multi-level constructor chaining in inheritance: the class
 * TennisPlayer extends Sportsman and must explicitly call the parent constructor with super()
 * when the parent class has no default constructor. We see that super() must be the first
 * statement in a derived constructor, and that if the parent class also provides a default
 * constructor, the derived class may omit the explicit super() call and the default constructor
 * will be invoked automatically.
 */
package javacourse.session4.inheritanceandconstructors.sportsman;
