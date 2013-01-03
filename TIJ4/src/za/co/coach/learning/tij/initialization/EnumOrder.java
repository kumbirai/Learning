package za.co.coach.learning.tij.initialization;

//: za.co.coach.learning.tij.initialization/EnumOrder.java

public class EnumOrder {
	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values())
			System.out.printf("%s, ordinal %s\n", s, s.ordinal());
	}
} /* Output:
NOT, ordinal 0
MILD, ordinal 1
MEDIUM, ordinal 2
HOT, ordinal 3
FLAMING, ordinal 4
*///:~
