//: za.co.coach.learning.tij.holding/MapOfList.java
package za.co.coach.learning.tij.holding;

import static za.co.coach.util.Print.print;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import za.co.coach.learning.tij.typeinfo.pets.Cat;
import za.co.coach.learning.tij.typeinfo.pets.Cymric;
import za.co.coach.learning.tij.typeinfo.pets.Dog;
import za.co.coach.learning.tij.typeinfo.pets.Mutt;
import za.co.coach.learning.tij.typeinfo.pets.Person;
import za.co.coach.learning.tij.typeinfo.pets.Pet;
import za.co.coach.learning.tij.typeinfo.pets.Pug;
import za.co.coach.learning.tij.typeinfo.pets.Rat;

public class MapOfList {
	public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPeople.put(new Person("Kate"), Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"),
				Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"), new Cat("Stanford aka Stinky el Negro"), new Cat("Pinkola")));
		petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
		petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Freckly")));
	}

	public static void main(String[] args) {
		print("People: " + petPeople.keySet());
		print("Pets: " + petPeople.values());
		for (Person person : petPeople.keySet()) {
			print(person + " has:");
			for (Pet pet : petPeople.get(person))
				print("    " + pet);
		}
	}
} /* Output:	
People: [Person Luke, Person Marilyn, Person Isaac, Person Dawn, Person Kate]
Pets: [[Rat Fuzzy, Rat Fizzy], [Pug Louie aka Louis Snorkelstein Dupree, Cat Stanford aka Stinky el Negro, Cat Pinkola], [Rat Freckly], [Cymric Molly, Mutt Spot], [Cat Shackleton, Cat Elsie May, Dog Margrett]]
Person Luke has:
  Rat Fuzzy
  Rat Fizzy
Person Marilyn has:
  Pug Louie aka Louis Snorkelstein Dupree
  Cat Stanford aka Stinky el Negro
  Cat Pinkola
Person Isaac has:
  Rat Freckly
Person Dawn has:
  Cymric Molly
  Mutt Spot
Person Kate has:
  Cat Shackleton
  Cat Elsie May
  Dog Margrett
*///:~
