package za.co.coach.learning.tij.typeinfo;

//: za.co.coach.learning.tij.typeinfo/InterfaceViolation.java
// Sneaking around an interface.
import za.co.coach.learning.tij.typeinfo.interfacea.A;

class B implements A {
	public void f() {
	}

	public void g() {
	}
}

public class InterfaceViolation {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		// a.g(); // Compile error
		System.out.println(a.getClass().getName());
		if (a instanceof B) {
			B b = (B) a;
			b.g();
		}
	}
} /* Output:
B
*///:~
