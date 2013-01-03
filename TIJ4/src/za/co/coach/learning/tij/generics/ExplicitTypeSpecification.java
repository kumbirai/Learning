package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/ExplicitTypeSpecification.java
import java.util.List;
import java.util.Map;

import za.co.coach.learning.tij.typeinfo.pets.Person;
import za.co.coach.learning.tij.typeinfo.pets.Pet;
import za.co.coach.util.New;

public class ExplicitTypeSpecification {
	static void f(Map<Person, List<Pet>> petPeople) {
	}

	public static void main(String[] args) {
		f(New.<Person, List<Pet>> map());
	}
} ///:~
