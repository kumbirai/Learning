package za.co.coach.learning.tij.polymorphism;

//: za.co.coach.learning.tij.polymorphism/Shapes.java
// Polymorphism in Java.
import za.co.coach.learning.tij.polymorphism.shape.RandomShapeGenerator;
import za.co.coach.learning.tij.polymorphism.shape.Shape;

public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();

	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		// Fill up the array with shapes:
		for (int i = 0; i < s.length; i++)
			s[i] = gen.next();
		// Make polymorphic method calls:
		for (Shape shp : s)
			shp.draw();
	}
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
