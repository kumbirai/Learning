package za.co.coach.learning.tij.holding;

//: za.co.coach.learning.tij.holding/StackCollision.java

public class StackCollision {
	public static void main(String[] args) {
		za.co.coach.util.Stack<String> stack = new za.co.coach.util.Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
		System.out.println();
		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack2.push(s);
		while (!stack2.empty())
			System.out.print(stack2.pop() + " ");
	}
} /* Output:
fleas has dog My
fleas has dog My
*///:~
