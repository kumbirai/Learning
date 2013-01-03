//: za.co.coach.learning.tij.annotations/AtUnitComposition.java
// Creating non-embedded tests.
package za.co.coach.learning.tij.annotations;

import za.co.coach.atunit.Test;
import za.co.coach.util.OSExecute;

public class AtUnitComposition {
	AtUnitExample1 testObject = new AtUnitExample1();

	@Test
	boolean _methodOne() {
		return testObject.methodOne().equals("This is methodOne");
	}

	@Test
	boolean _methodTwo() {
		return testObject.methodTwo() == 2;
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command("java za.co.coach.atunit.AtUnit AtUnitComposition");
	}
} /* Output:
za.co.coach.learning.tij.annotations.AtUnitComposition
. _methodOne
. _methodTwo This is methodTwo

OK (2 tests)
*///:~
