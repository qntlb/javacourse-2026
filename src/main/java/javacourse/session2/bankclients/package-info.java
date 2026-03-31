/**
 * In this package we show the Builder pattern as a practical use of returning this from
 * instance methods. The class Client represents a bank client with many fields; to avoid
 * mistakes when passing a long list of arguments to a constructor, each field can be set
 * through a dedicated method that returns the object itself, enabling method chaining on
 * a single line. A static factory method is used to start the construction.
 */
package javacourse.session2.bankclients;
