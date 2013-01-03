package za.co.coach.learning.tij.typeinfo;

//: za.co.coach.learning.tij.typeinfo/PetCount3.java
// Using isInstance()
import static za.co.coach.util.Print.print;
import static za.co.coach.util.Print.printnb;

import java.util.LinkedHashMap;
import java.util.Map;

import za.co.coach.learning.tij.typeinfo.pets.LiteralPetCreator;
import za.co.coach.learning.tij.typeinfo.pets.Pet;
import za.co.coach.learning.tij.typeinfo.pets.Pets;
import za.co.coach.util.MapData;

public class PetCount3 {
	static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
		public PetCounter() {
			super(MapData.map(LiteralPetCreator.allTypes, 0));
		}

		public void count(Pet pet) {
			// Class.isInstance() eliminates instanceofs:
			for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet())
				if (pair.getKey().isInstance(pet))
					put(pair.getKey(), pair.getValue() + 1);
		}

		public String toString() {
			StringBuilder result = new StringBuilder("{");
			for (Map.Entry<Class<? extends Pet>, Integer> pair : entrySet()) {
				result.append(pair.getKey().getSimpleName());
				result.append("=");
				result.append(pair.getValue());
				result.append(", ");
			}
			result.delete(result.length() - 2, result.length());
			result.append("}");
			return result.toString();
		}
	}

	public static void main(String[] args) {
		PetCounter petCount = new PetCounter();
		for (Pet pet : Pets.createArray(20)) {
			printnb(pet.getClass().getSimpleName() + " ");
			petCount.count(pet);
		}
		print();
		print(petCount);
	}
} /* Output:
Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
{Pet=20, Dog=6, Cat=9, Rodent=5, Mutt=3, Pug=3, EgyptianMau=2, Manx=7, Cymric=5, Rat=2, Mouse=2, Hamster=1}
*///:~
