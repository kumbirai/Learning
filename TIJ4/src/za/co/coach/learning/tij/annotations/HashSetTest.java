//: za.co.coach.learning.tij.annotations/HashSetTest.java
package za.co.coach.learning.tij.annotations;

import java.util.HashSet;

import za.co.coach.atunit.Test;
import za.co.coach.util.OSExecute;

public class HashSetTest {
	HashSet<String> testObject = new HashSet<String>();

	@Test
	void initialization() {
		assert testObject.isEmpty();
	}

	@Test
	void _contains() {
		testObject.add("one");
		assert testObject.contains("one");
	}

	@Test
	void _remove() {
		testObject.add("one");
		testObject.remove("one");
		assert testObject.isEmpty();
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command("java za.co.coach.atunit.AtUnit HashSetTest");
	}
} /* Output:
za.co.coach.learning.tij.annotations.HashSetTest
. za.co.coach.learning.tij.initialization
. _remove
. _contains
OK (3 tests)
*///:~
