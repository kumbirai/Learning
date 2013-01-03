package za.co.coach.learning.tij.reusing;

//: za.co.coach.learning.tij.reusing/Cartoon.java
// Constructor calls during inheritance.
import static za.co.coach.util.Print.print;

class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		print("Drawing constructor");
	}
}

public class Cartoon extends Drawing {
	public Cartoon() {
		print("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon x = new Cartoon();
	}
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
