package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/ListOfGenerics.java
import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {
	private List<T> array = new ArrayList<T>();

	public void add(T item) {
		array.add(item);
	}

	public T get(int index) {
		return array.get(index);
	}
} ///:~
