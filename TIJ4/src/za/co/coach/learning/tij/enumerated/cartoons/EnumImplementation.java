//: za.co.coach.learning.tij.enumerated/cartoons/EnumImplementation.java
// An enum can implement an interface
package za.co.coach.learning.tij.enumerated.cartoons;

import java.util.Random;

import za.co.coach.util.Generator;

enum CartoonCharacter implements Generator<CartoonCharacter> {
	SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;
	private Random rand = new Random();

	public CartoonCharacter next() {
		return values()[rand.nextInt(values().length)];
	}
}

public class EnumImplementation {
	public static <T> void printNext(Generator<T> rg) {
		System.out.print(rg.next() + ", ");
	}

	public static void main(String[] args) {
		// Choose any instance:
		CartoonCharacter cc = CartoonCharacter.BOB;
		for (int i = 0; i < 10; i++)
			printNext(cc);
	}
} /* Output:
BOB, PUNCHY, BOB, SPANKY, NUTTY, PUNCHY, SLAPPY, NUTTY, NUTTY, SLAPPY,
*///:~
