package za.co.coach.learning.tij.operators;

//: za.co.coach.learning.tij.operators/PassObject.java
// Passing objects to methods may not be
// what you're used to.
import static za.co.coach.util.Print.print;

class Letter {
	char c;
}

public class PassObject {
	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		print("1: x.c: " + x.c);
		f(x);
		print("2: x.c: " + x.c);
	}
} /* Output:
1: x.c: a
2: x.c: z
*///:~
