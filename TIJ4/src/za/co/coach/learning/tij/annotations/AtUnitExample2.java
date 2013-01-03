//: za.co.coach.learning.tij.annotations/AtUnitExample2.java
// Assertions and za.co.coach.learning.tij.exceptions can be used in @Tests.
package za.co.coach.learning.tij.annotations;

import java.io.FileInputStream;
import java.io.IOException;

import za.co.coach.atunit.Test;
import za.co.coach.util.OSExecute;

public class AtUnitExample2 {
	public String methodOne() {
		return "This is methodOne";
	}

	public int methodTwo() {
		System.out.println("This is methodTwo");
		return 2;
	}

	@Test
	void assertExample() {
		assert methodOne().equals("This is methodOne");
	}

	@Test
	void assertFailureExample() {
		assert 1 == 2 : "What a surprise!";
	}

	@Test
	void exceptionExample() throws IOException {
		new FileInputStream("nofile.txt"); // Throws
	}

	@Test
	boolean assertAndReturn() {
		// Assertion with message:
		assert methodTwo() == 2 : "methodTwo must equal 2";
		return methodOne().equals("This is methodOne");
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command("java za.co.coach.atunit.AtUnit AtUnitExample2");
	}
} /* Output:
za.co.coach.learning.tij.annotations.AtUnitExample2
. assertExample
. assertFailureExample java.lang.AssertionError: What a surprise!
(failed)
. exceptionExample java.io.FileNotFoundException: nofile.txt (The system cannot find the file specified)
(failed)
. assertAndReturn This is methodTwo

(4 tests)

>>> 2 FAILURES <<<
za.co.coach.learning.tij.annotations.AtUnitExample2: assertFailureExample
za.co.coach.learning.tij.annotations.AtUnitExample2: exceptionExample
*///:~
