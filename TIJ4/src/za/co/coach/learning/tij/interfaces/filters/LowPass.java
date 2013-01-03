//: za.co.coach.learning.tij.interfaces/filters/LowPass.java
package za.co.coach.learning.tij.interfaces.filters;

public class LowPass extends Filter {
	double cutoff;

	public LowPass(double cutoff) {
		this.cutoff = cutoff;
	}

	public Waveform process(Waveform input) {
		return input; // Dummy processing
	}
} ///:~
