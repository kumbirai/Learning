//: za.co.coach.learning.tij.interfaces/filters/Waveform.java
package za.co.coach.learning.tij.interfaces.filters;

public class Waveform {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Waveform " + id;
	}
} ///:~
