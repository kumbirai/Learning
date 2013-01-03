//: za.co.coach.learning.tij.annotations/AtUnitExample1.java
package za.co.coach.learning.tij.annotations;

import za.co.coach.atunit.Test;
import za.co.coach.util.OSExecute;

public class AtUnitExample1 {
	public String methodOne() {
		return "This is methodOne";
	}

	public int methodTwo() {
		System.out.println("This is methodTwo");
		return 2;
	}

	@Test
	boolean methodOneTest() {
		return methodOne().equals("This is methodOne");
	}

	@Test
	boolean m2() {
		return methodTwo() == 2;
	}

	@Test
	private boolean m3() {
		return true;
	}

	// Shows output for failure:
	@Test
	boolean failureTest() {
		return false;
	}

	@Test
	boolean anotherDisappointment() {
		return false;
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command("java za.co.coach.atunit.AtUnit AtUnitExample1");
	}
} /* Output:
za.co.coach.learning.tij.annotations.AtUnitExample1
. methodOneTest
. m2 This is methodTwo

. m3
. failureTest (failed)
. anotherDisappointment (failed)
(5 tests)

>>> 2 FAILURES <<<
za.co.coach.learning.tij.annotations.AtUnitExample1: failureTest
za.co.coach.learning.tij.annotations.AtUnitExample1: anotherDisappointment
*///:~
