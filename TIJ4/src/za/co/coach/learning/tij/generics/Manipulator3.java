package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/Manipulator3.java

class Manipulator3 {
	private HasF obj;

	public Manipulator3(HasF x) {
		obj = x;
	}

	public void manipulate() {
		obj.f();
	}
} ///:~
