package javacourse.session3.privateconstructor.enhancedmortgages;

/**
 * This class is strictly related to javacourse.session2.mortgages.Mortgage, that was an example of a
 * possible use of static fields in order to know the total amount of money we lend to clients. We had a static field
 * loansSum whose value was shared among all the objects of Mortgage and got incremented every time
 * such an object is created. We had printed a warning message as soon as the value of this field was bigger than
 * a maximum. However, we could not prevent the possibility to produce more object after that time.
 * A solution is now to have a private constructor, which is called only if loansSum <= budget.
 */
public class Mortgage {

	private static double loansSum = 0; // static: shared by all the objects. Initially zero.
	private static double budget = 1E6;
	// this field is not meant to be static: it must be able to vary for every customer
	private String name;
	private int age; // non static, for the same reason
	private double amount; // same thing

	/*
	 * TODO: write a private constructor Mortgage(String name, int age, double amount)
	 * and a public static method constructMortgage(...) which returns an object of type Mortgage if
	 * the total amount loaned is below the budget. For the constructor you can look at
	 * javacourse.session2.mortgages.Mortgage
	 */
	private Mortgage(String name, int age, double amount) {
		this.name = name; // note the use of this
		this.age = age; // note the use of this
		this.amount = amount;

		System.out.println("The name of our new customer is " + name + ". He is " + age + " years old."
				+ " We lend him/her " + amount + " euros.");

		loansSum += amount;
		System.out.println("Sum of all the loans: " + loansSum + " Euros.");
		System.out.println();
		}
	
	public static Mortgage constructMortgage(String name, int age, double amount) {
		if (loansSum + amount <= budget) {
			return new Mortgage(name, age, amount);
		}
		System.out.println("The mortgage of " + name + " gets rejected because we are out of budget.");
		System.out.println();
		return null;
	}
}
