/**
 * In this package we test cross-package access to verify how the public and package access
 * modifiers behave when accessed from a different package. The class AccessTestOutside
 * imports the class Access from javacourse.session3.accesslevels and attempts to call its
 * methods and access its fields: only public members are accessible, while package-access
 * and private members result in a compilation error.
 */
package javacourse.session3.otherpackage;
