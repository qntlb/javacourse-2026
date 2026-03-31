/**
 * In this package we extend the bank savings account example to illustrate two uses of the
 * keyword this in constructors: first, this.fieldName resolves name clashes when a constructor
 * parameter has the same name as a field of the class; second, this(...) allows one overloaded
 * constructor to delegate to another constructor of the same class, avoiding code duplication.
 * Note that this(...) must be the very first statement inside a constructor.
 */
package javacourse.session2.bankaccountwiththis;
