//: za.co.coach.learning.tij.annotations/Testable.java
package za.co.coach.learning.tij.annotations;

import za.co.coach.atunit.Test;

public class Testable {
	public void execute() {
		System.out.println("Executing..");
	}

	@Test
	void testExecute() {
		execute();
	}
} ///:~
