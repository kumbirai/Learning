package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/ReturnGenericType.java

class ReturnGenericType<T extends HasF> {
	private T obj;

	public ReturnGenericType(T x) {
		obj = x;
	}

	public T get() {
		return obj;
	}
} ///:~
