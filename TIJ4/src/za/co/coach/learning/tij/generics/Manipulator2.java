package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/Manipulator2.java

class Manipulator2<T extends HasF> {
	private T obj;

	public Manipulator2(T x) {
		obj = x;
	}

	public void manipulate() {
		obj.f();
	}
} ///:~
