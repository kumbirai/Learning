package za.co.coach.learning.tij.reusing;

//: za.co.coach.learning.tij.reusing/Bath.java
// Constructor za.co.coach.learning.tij.initialization with composition.
import static za.co.coach.util.Print.print;

class Soap {
	private String s;

	Soap() {
		print("Soap()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class Bath {
	private String // Initializing at point of definition:
			s1 = "Happy",
			s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;

	public Bath() {
		print("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	// Instance initialization:
	{
		i = 47;
	}

	public String toString() {
		if (s4 == null) // Delayed initialization:
			s4 = "Joy";
		return String.format("s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\ni = %d\ntoy = %.2f\ncastille = %s", s1, s2, s3, s4, i, toy, castille);
	}

	public static void main(String[] args) {
		Bath b = new Bath();
		print(b);
	}
} /* Output:
Inside Bath()
Soap()
s1 = Happy
s2 = Happy
s3 = Joy
s4 = Joy
i = 47
toy = 3.14
castille = Constructed
*///:~
