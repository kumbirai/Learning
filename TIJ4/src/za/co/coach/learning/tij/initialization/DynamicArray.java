package za.co.coach.learning.tij.initialization;

//: za.co.coach.learning.tij.initialization/DynamicArray.java
// Array za.co.coach.learning.tij.initialization.

public class DynamicArray {
	public static void main(String[] args) {
		Other.main(new String[] { "fiddle", "de", "dum" });
	}
}

class Other {
	public static void main(String[] args) {
		for (String s : args)
			System.out.print(s + " ");
	}
} /* Output:
fiddle de dum
*///:~
