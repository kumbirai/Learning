package za.co.coach.learning.tij.initialization;

//: za.co.coach.learning.tij.initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.
import static za.co.coach.util.Print.print;

class Tree {
	int height;

	Tree() {
		print("Planting a seedling");
		height = 0;
	}

	Tree(int initialHeight) {
		height = initialHeight;
		print(String.format("Creating new Tree that is %s feet tall", height));
	}

	void info() {
		print(String.format("Tree is %s feet tall", height));
	}

	void info(String s) {
		print(String.format("%s: Tree is %s feet tall", s, height));
	}
}

public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloaded method");
		}
		// Overloaded constructor:
		new Tree();
	}
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~
