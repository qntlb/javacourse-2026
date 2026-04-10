package javacourse.session4.polymorphism.shapes;

/**
 * Particular kind of shape, for which we know how to compute the area, i.e.,
 * how to implement the method computeArea().
 *
 */
public class Square extends Shape {
	
	/*
	 * TODO: implement the class. You can guess its fields and methods from the main ShapeAreaTest,
	 * the parent class and the Class RandomShapeGenerator
	 */
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double computeArea() {
		System.out.println("Computing the area of the square...");
		return Math.pow(side, 2);
	}


}
