package za.co.coach.learning.tij.typeinfo;

//: za.co.coach.learning.tij.typeinfo/BoundedClassReferences.java

public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		// Or anything else derived from Number.
	}
} ///:~
