package za.co.coach.learning.tij.typeinfo;

//: za.co.coach.learning.tij.typeinfo/HiddenImplementation.java
// Sneaking around package za.co.coach.learning.tij.access.
import java.lang.reflect.Method;

import za.co.coach.learning.tij.typeinfo.interfacea.A;
import za.co.coach.learning.tij.typeinfo.packageaccess.HiddenC;

public class HiddenImplementation {
	public static void main(String[] args) throws Exception {
		A a = HiddenC.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// Compile error: cannot find symbol 'C':
		/* if(a instanceof C) {
		  C c = (C)a;
		  c.g();
		} */
		// Oops! Reflection still allows us to call g():
		callHiddenMethod(a, "g");
		// And even methods that are less accessible!
		callHiddenMethod(a, "u");
		callHiddenMethod(a, "v");
		callHiddenMethod(a, "w");
	}

	static void callHiddenMethod(Object a, String methodName) throws Exception {
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
} /* Output:
public C.f()
za.co.coach.learning.tij.typeinfo.packageaccess.C
public C.g()
package C.u()
protected C.v()
private C.w()
*///:~
