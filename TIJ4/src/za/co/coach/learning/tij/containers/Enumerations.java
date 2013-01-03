package za.co.coach.learning.tij.containers;

//: za.co.coach.learning.tij.containers/Enumerations.java
// Java 1.0/1.1 Vector and Enumeration.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import za.co.coach.util.Countries;

public class Enumerations {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Countries.names(10));
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements())
			System.out.print(e.nextElement() + ", ");
		// Produce an Enumeration from a Collection:
		e = Collections.enumeration(new ArrayList<String>());
	}
} /* Output:
ALGERIA, ANGOLA, BENIN, BOTSWANA, BULGARIA, BURKINA FASO, BURUNDI, CAMEROON, CAPE VERDE, CENTRAL AFRICAN REPUBLIC,
*///:~
