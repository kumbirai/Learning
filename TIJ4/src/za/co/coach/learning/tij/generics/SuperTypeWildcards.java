package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/SuperTypeWildcards.java
import java.util.List;

public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
		// apples.add(new Fruit()); // Error
	}
} ///:~
