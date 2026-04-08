package javacourse.session3.accesslevels;

/**
 * An example of package access class.
 *
 */
class PackageAccessOnly {//this class is not public, but has package access: no public access modifier

	PackageAccessOnly() {
		System.out.println("A package access only class is created.");
	}
}
/*
 * Look what happens when we try to construct objects of this class from
 * javacourse.session3.otherpackage.AccessTestOutside
 */