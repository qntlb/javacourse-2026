/**
 * In this package we contrast composition ("has-a") with inheritance ("is-a") through a car
 * example. A Car cannot meaningfully be said to "be" an Engine, so inheritance is the wrong
 * tool; instead, Car has a field of type Engine and delegates the startEngine() behavior to it.
 * This delegation pattern illustrates how composition allows a class to reuse the functionality
 * of another class without establishing an inheritance relationship.
 */
package javacourse.session4.composition.car;
