package javacourse.session4.polymorphism.shapes;

/**
 * Class implementing a circle, a particular kind of shape, for which we know how to compute the area, i.e.,
 * how to implement the method computeArea().
 *
 */
public class Circle extends Shape {

	/*
	 * TODO: implement the class. You can guess its fields and methods from the main ShapeAreaTest,
	 * the parent class and the Class RandomShapeGenerator
	 */
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		System.out.println("Computing the area of the circle...");
		return Math.PI * Math.pow(radius, 2);
	}

}