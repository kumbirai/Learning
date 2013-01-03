package za.co.coach.learning.tij.initialization;

//: za.co.coach.learning.tij.initialization/ArrayNew.java
// Creating za.co.coach.learning.tij.arrays with new.
import static za.co.coach.util.Print.print;

import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random();
		a = new int[rand.nextInt(20)];
		print("length of a = " + a.length);
		print(Arrays.toString(a));
	}
} /* Output:
length of a = 18
[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
*///:~
