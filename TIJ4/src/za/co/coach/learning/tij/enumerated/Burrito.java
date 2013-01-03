//: za.co.coach.learning.tij.enumerated/Burrito.java
package za.co.coach.learning.tij.enumerated;

import static za.co.coach.learning.tij.enumerated.Spiciness.HOT;
import static za.co.coach.learning.tij.enumerated.Spiciness.MEDIUM;
import static za.co.coach.learning.tij.enumerated.Spiciness.NOT;

public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		this.degree = degree;
	}

	public String toString() {
		return "Burrito is " + degree;
	}

	public static void main(String[] args) {
		System.out.println(new Burrito(NOT));
		System.out.println(new Burrito(MEDIUM));
		System.out.println(new Burrito(HOT));
	}
} /* Output:
Burrito is NOT
Burrito is MEDIUM
Burrito is HOT
*///:~
