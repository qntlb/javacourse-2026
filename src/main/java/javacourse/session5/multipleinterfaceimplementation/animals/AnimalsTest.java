package javacourse.session5.multipleinterfaceimplementation.animals;

/**
 * This class tests how multiple implementation works. Note that an object of
 * type Duck can be passed to both the methods makeSwim() and makeFly() (again
 * polymorphism here!)
 */
public class AnimalsTest {

	public static void makeSwim(AnimalThatSwims s) {// an object of any class implementing AnimalThatSwims: polymorphism
		s.swim();
	}

	public static void makeFly(AnimalThatFlies f) {// an object of any class implementing AnimalThatFlies: polymorphism
		f.fly();
	}

	public static void main(String[] args) {
		Fish codfish = new Fish();
		Eagle anEagle = new Eagle();
		Duck aDuck = new Duck();
		
		makeSwim(codfish);// upcasting
		makeFly(anEagle);// upcasting
		makeFly(aDuck);// upcasting
		makeSwim(aDuck);// upcasting
		
		// aDuck is of type Duck, therefore it implements the method eat()
		aDuck.eat();
		
		System.out.println("The value of interfaceField is: "+ aDuck.interfaceField);
	}
}
