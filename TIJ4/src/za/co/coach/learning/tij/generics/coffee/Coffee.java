//: za.co.coach.learning.tij.generics/coffee/Coffee.java
package za.co.coach.learning.tij.generics.coffee;

public class Coffee {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
} ///:~
