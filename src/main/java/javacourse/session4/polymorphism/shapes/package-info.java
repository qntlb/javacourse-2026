/**
 * In this package we apply polymorphism to geometric shapes: the base class Shape defines a
 * computeArea() method that is overridden in each derived class (Circle, Square, Triangle) with
 * the appropriate formula. A random shape generator creates objects of different types stored
 * under a Shape reference, and the correct area computation is selected at run time through
 * late binding. This illustrates how polymorphism allows writing code that works uniformly
 * for all subtypes without knowing the specific type at compile time.
 */
package javacourse.session4.polymorphism.shapes;
