package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/SimplerPets.java
import java.util.List;
import java.util.Map;

import za.co.coach.learning.tij.typeinfo.pets.Person;
import za.co.coach.learning.tij.typeinfo.pets.Pet;
import za.co.coach.util.New;

public class SimplerPets {
	public static void main(String[] args) {
		Map<Person, List<? extends Pet>> petPeople = New.map();
		// Rest of the code is the same...
	}
} ///:~
