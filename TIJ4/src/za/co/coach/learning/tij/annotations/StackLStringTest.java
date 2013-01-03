//: za.co.coach.learning.tij.annotations/StackLStringTest.java
// Applying @Unit to za.co.coach.learning.tij.generics.
package za.co.coach.learning.tij.annotations;

import za.co.coach.atunit.Test;
import za.co.coach.util.OSExecute;

public class StackLStringTest extends StackL<String> {
	@Test
	void _push() {
		push("one");
		assert top().equals("one");
		push("two");
		assert top().equals("two");
	}

	@Test
	void _pop() {
		push("one");
		push("two");
		assert pop().equals("two");
		assert pop().equals("one");
	}

	@Test
	void _top() {
		push("A");
		push("B");
		assert top().equals("B");
		assert top().equals("B");
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command("java za.co.coach.atunit.AtUnit StackLStringTest");
	}
} /* Output:
za.co.coach.learning.tij.annotations.StackLStringTest
. _push
. _pop
. _top
OK (3 tests)
*///:~
