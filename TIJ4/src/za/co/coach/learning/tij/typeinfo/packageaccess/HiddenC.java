//: za.co.coach.learning.tij.typeinfo/packageaccess/HiddenC.java
package za.co.coach.learning.tij.typeinfo.packageaccess;

import static za.co.coach.util.Print.print;
import za.co.coach.learning.tij.typeinfo.interfacea.A;

class C implements A {
	public void f() {
		print("public C.f()");
	}

	public void g() {
		print("public C.g()");
	}

	void u() {
		print("package C.u()");
	}

	protected void v() {
		print("protected C.v()");
	}

	private void w() {
		print("private C.w()");
	}
}

public class HiddenC {
	public static A makeA() {
		return new C();
	}
} ///:~
