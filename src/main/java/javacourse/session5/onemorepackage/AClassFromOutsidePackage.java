package javacourse.session5.onemorepackage;

import javacourse.session5.packageaccessclasswithpublicmethods.APublicClass;

//import javacourse.session5.packageaccessclasswithpublicmethods.PackageAccessClass;

public class AClassFromOutsidePackage {

	public static void main(String[] args) {

		APublicClass anObject = new APublicClass();
		anObject.aPublicMethod();
	}

}
