package za.co.coach.learning.tij.holding;

//: za.co.coach.learning.tij.holding/StackTest.java
import za.co.coach.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
} /* Output:
fleas has dog My
*///:~
