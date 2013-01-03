package za.co.coach.learning.tij.initialization;

//: za.co.coach.learning.tij.initialization/ArraysOfPrimitives.java
import static za.co.coach.util.Print.print;

import java.util.Arrays;

public class ArraysOfPrimitives {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = new int[5];
		System.out.printf("a2.length = %s with members: %s\n", a2.length, Arrays.toString(a2));
		Integer[] a3 = new Integer[5];
		System.out.printf("a3.length = %s with members: %s\n", a3.length, Arrays.toString(a3));
		a2 = a1;
		for (int i = 0; i < a2.length; i++)
			a2[i] = a2[i] + 1;
		for (int i = 0; i < a1.length; i++)
			print("a1[" + i + "] = " + a1[i]);
	}
} /* Output:
a1[0] = 2
a1[1] = 3
a1[2] = 4
a1[3] = 5
a1[4] = 6
*///:~
