package za.co.coach.learning.tij.control;

//: za.co.coach.learning.tij.control/CommaOperator.java

public class CommaOperator {
	public static void main(String[] args) {
		for (int i = 1, j = i + 10; i < 5; i++, j = (int) Math.pow(2, i)) {
			System.out.printf("i = %s, j = %s\n", i, j);
		}
	}
} /* Output:
i = 1 j = 11
i = 2 j = 4
i = 3 j = 6
i = 4 j = 8
*///:~
