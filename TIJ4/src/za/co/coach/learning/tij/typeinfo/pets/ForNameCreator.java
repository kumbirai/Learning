//: za.co.coach.learning.tij.typeinfo/pets/ForNameCreator.java
package za.co.coach.learning.tij.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	// Types that you want to be randomly created:
	private static String[] typeNames = { "za.co.coach.learning.tij.typeinfo.pets.Mutt", "za.co.coach.learning.tij.typeinfo.pets.Pug",
			"za.co.coach.learning.tij.typeinfo.pets.EgyptianMau", "za.co.coach.learning.tij.typeinfo.pets.Manx",
			"za.co.coach.learning.tij.typeinfo.pets.Cymric", "za.co.coach.learning.tij.typeinfo.pets.Rat", "za.co.coach.learning.tij.typeinfo.pets.Mouse",
			"za.co.coach.learning.tij.typeinfo.pets.Hamster" };

	@SuppressWarnings("unchecked")
	private static void loader() {
		try {
			for (String name : typeNames)
				types.add((Class<? extends Pet>) Class.forName(name));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	static {
		loader();
	}

	public List<Class<? extends Pet>> types() {
		return types;
	}
} ///:~
