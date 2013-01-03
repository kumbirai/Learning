package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/SelfBoundingMethods.java

public class SelfBoundingMethods {
	static <T extends SelfBounded<T>> T f(T arg) {
		return arg.set(arg).get();
	}

	public static void main(String[] args) {
		A a = f(new A());
	}
} ///:~
