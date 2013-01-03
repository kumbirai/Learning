package za.co.coach.learning.tij.operators;

//: za.co.coach.learning.tij.operators/Bool.java
// Relational and logical za.co.coach.learning.tij.operators.
import static za.co.coach.util.Print.print;

import java.util.Random;

public class Bool {
	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		print("i = " + i);
		print("j = " + j);
		print("i > j is " + (i > j));
		print("i < j is " + (i < j));
		print("i >= j is " + (i >= j));
		print("i <= j is " + (i <= j));
		print("i == j is " + (i == j));
		print("i != j is " + (i != j));
		// Treating an int as a boolean is not legal Java:
		//! print("i && j is " + (i && j));
		//! print("i || j is " + (i || j));
		//! print("!i is " + !i);
		print("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		print("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
	}
} /* Output:
i = 58
j = 55
i > j is true
i < j is false
i >= j is true
i <= j is false
i == j is false
i != j is true
(i < 10) && (j < 10) is false
(i < 10) || (j < 10) is false
*///:~
