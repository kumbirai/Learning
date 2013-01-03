package za.co.coach.learning.tij.containers;

//: za.co.coach.learning.tij.containers/Test.java
// Framework for performing timed tests of za.co.coach.learning.tij.containers.

public abstract class Test<C> {
	String name;

	public Test(String name) {
		this.name = name;
	}

	// Override this method for different tests.
	// Returns actual number of repetitions of test.
	abstract int test(C container, TestParam tp);
} ///:~
