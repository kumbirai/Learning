package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/LimitsOfInference.java
import java.util.List;
import java.util.Map;

import za.co.coach.learning.tij.typeinfo.pets.Person;
import za.co.coach.learning.tij.typeinfo.pets.Pet;

public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) {
	}

	public static void main(String[] args) {
		// f(New.map()); // Does not compile
	}
} ///:~
