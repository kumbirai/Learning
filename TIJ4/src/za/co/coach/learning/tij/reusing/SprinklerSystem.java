package za.co.coach.learning.tij.reusing;

//: za.co.coach.learning.tij.reusing/SprinklerSystem.java
// Composition for code reuse.

class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	public String toString() {
		return String.format("valve1 = %s valve2 = %s valve3 = %s valve4 = %s\ni = %d f = %f source = %s", valve1, valve2, valve3, valve4, i, f, source);
	}

	public static void main(String[] args) {
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
	}
} /* Output:
WaterSource()
valve1 = null valve2 = null valve3 = null valve4 = null
i = 0 f = 0.0 source = Constructed
*///:~
