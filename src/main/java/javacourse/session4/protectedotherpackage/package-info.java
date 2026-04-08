/**
 * In this package we illustrate the protected access modifier when accessed from a different
 * package through inheritance. The class ParentClassOtherPackage has a protected field and a
 * protected method; a derived class in another package can access them through inheritance, while
 * a class in another package that does not extend ParentClassOtherPackage cannot. This contrasts
 * with package-access members, which are accessible only within the same package regardless of
 * the inheritance relationship.
 */
package javacourse.session4.protectedotherpackage;
