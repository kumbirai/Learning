//: za.co.coach.learning.tij.interfaces/filters/HighPass.java
package za.co.coach.learning.tij.interfaces.filters;

public class HighPass extends Filter {
	double cutoff;

	public HighPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public Waveform process(Waveform input) {
		return input;
	}
} ///:~
