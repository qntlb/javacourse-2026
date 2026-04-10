package javacourse.session4.polymorphism.shapes;

/**
 * Class implementing a triangle, a particular kind of shape, for which we know how to compute the area,
 * i.e., how to implement the method computeArea().
 *
 */
public class Triangle extends Shape {
	
	/*
	 * TODO: implement the class. You can guess its fields and methods from the main ShapeAreaTest,
	 * the parent class and the Class RandomShapeGenerator
	 */
	private double basis;
	private double height;
	
	public Triangle(double basis, double height) {
		this.basis = basis;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		System.out.println("Computing the area of the triangle...");
		return basis * height / 2;
	}

}

