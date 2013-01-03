package za.co.coach.learning.tij.initialization;

//: za.co.coach.learning.tij.initialization/OverloadingVarargs.java

public class OverloadingVarargs {
	static void f(Character... args) {
		System.out.print("first");
		for (Character c : args)
			System.out.printf(" %s", c);
		System.out.println();
	}

	static void f(Integer... args) {
		System.out.print("second");
		for (Integer i : args)
			System.out.printf(" %s", i);
		System.out.println();
	}

	static void f(Long... args) {
		System.out.print("third");
		for (Long l : args)
			System.out.printf(" %s", l);
		System.out.println();
	}

	public static void main(String[] args) {
		f('a', 'b', 'c');
		f(1);
		f(2, 1);
		f('2', '3', '7', '8', '9');
		f(0L);
		//! f(); // Won't compile -- ambiguous
	}
} /* Output:
first a b c
second 1
second 2 1
second 0
third
*///:~
