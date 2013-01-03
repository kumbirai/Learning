//: za.co.coach.learning.tij.polymorphism/PrivateOverride.java
// Trying to override a private method.
package za.co.coach.learning.tij.polymorphism;

import static za.co.coach.util.Print.print;

public class PrivateOverride {
	private void f() {
		print("private f()");
	}

	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride {
	public void f() {
		print("public f()");
	}
} /* Output:
private f()
*///:~
