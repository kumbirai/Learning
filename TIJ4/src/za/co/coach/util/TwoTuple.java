//: net/mindview/util/TwoTuple.java
package za.co.coach.util;

public class TwoTuple<A, B> {
	public final A first;
	public final B second;

	public TwoTuple(A a, B b) {
		first = a;
		second = b;
	}

	public String toString() {
		return "(" + first + ", " + second + ")";
	}
} ///:~
