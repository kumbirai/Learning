//: za.co.coach.learning.tij.interfaces/interfaceprocessor/Apply.java
package za.co.coach.learning.tij.interfaces.interfaceprocessor;

import static za.co.coach.util.Print.print;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
} ///:~
