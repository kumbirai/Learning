//: za.co.coach.learning.tij.annotations/AtUnitExample3.java
package za.co.coach.learning.tij.annotations;

import za.co.coach.atunit.Test;
import za.co.coach.atunit.TestObjectCreate;
import za.co.coach.util.OSExecute;

public class AtUnitExample3 {
	private int n;

	public AtUnitExample3(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public String methodOne() {
		return "This is methodOne";
	}

	public int methodTwo() {
		System.out.println("This is methodTwo");
		return 2;
	}

	@TestObjectCreate
	static AtUnitExample3 create() {
		return new AtUnitExample3(47);
	}

	@Test
	boolean initialization() {
		return n == 47;
	}

	@Test
	boolean methodOneTest() {
		return methodOne().equals("This is methodOne");
	}

	@Test
	boolean m2() {
		return methodTwo() == 2;
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command("java za.co.coach.atunit.AtUnit AtUnitExample3");
	}
} /* Output:
za.co.coach.learning.tij.annotations.AtUnitExample3
. za.co.coach.learning.tij.initialization
. methodOneTest
. m2 This is methodTwo

OK (3 tests)
*///:~
