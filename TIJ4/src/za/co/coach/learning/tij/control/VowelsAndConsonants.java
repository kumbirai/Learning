package za.co.coach.learning.tij.control;

//: za.co.coach.learning.tij.control/VowelsAndConsonants.java
// Demonstrates the switch statement.
import static za.co.coach.util.Print.print;
import static za.co.coach.util.Print.printnb;

import java.util.Random;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			printnb((char) c + ", " + c + ": ");
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				print("vowel");
				break;
			case 'y':
			case 'w':
				print("Sometimes a vowel");
				break;
			default:
				print("consonant");
			}
		}
	}
} /* Output:
y, 121: Sometimes a vowel
n, 110: consonant
z, 122: consonant
b, 98: consonant
r, 114: consonant
n, 110: consonant
y, 121: Sometimes a vowel
g, 103: consonant
c, 99: consonant
f, 102: consonant
o, 111: vowel
w, 119: Sometimes a vowel
z, 122: consonant
...
*///:~
