package za.co.coach.learning.tij.innerclasses;

//: za.co.coach.learning.tij.innerclasses/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.
import static za.co.coach.util.Print.print;

abstract class Base {
	public Base(int i) {
		print("Base constructor, i = " + i);
	}

	public abstract void f();
}

public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{
				print("Inside instance initializer");
			}

			public void f() {
				print("In anonymous f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
} /* Output:
Base constructor, i = 47
Inside instance initializer
In anonymous f()
*///:~
