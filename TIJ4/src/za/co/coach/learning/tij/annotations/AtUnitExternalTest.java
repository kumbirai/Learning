//: za.co.coach.learning.tij.annotations/AtUnitExternalTest.java
// Creating non-embedded tests.
package za.co.coach.learning.tij.annotations;

import za.co.coach.atunit.Test;
import za.co.coach.util.OSExecute;

public class AtUnitExternalTest extends AtUnitExample1 {
	@Test
	boolean _methodOne() {
		return methodOne().equals("This is methodOne");
	}

	@Test
	boolean _methodTwo() {
		return methodTwo() == 2;
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command("java za.co.coach.atunit.AtUnit AtUnitExternalTest");
	}
} /* Output:
za.co.coach.learning.tij.annotations.AtUnitExternalTest
. _methodOne
. _methodTwo This is methodTwo

OK (2 tests)
*///:~
