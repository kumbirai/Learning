package za.co.coach.learning.tij.operators;

//: za.co.coach.learning.tij.operators/AllOps.java
// Tests all the za.co.coach.learning.tij.operators on all the primitive data types
// to show which ones are accepted by the Java compiler.

public class AllOps {
	// To accept the results of a boolean test:
	void f(boolean b) {
	}

	void boolTest(boolean x, boolean y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		//! x = x * y;
		//! x = x / y;
		//! x = x % y;
		//! x = x + y;
		//! x = x - y;
		//! x++;
		//! x--;
		//! x = +y;
		//! x = -y;
		// Relational and logical:
		//! f(x > y);
		//! f(x >= y);
		//! f(x < y);
		//! f(x <= y);
		f(x == y);
		f(x != y);
		f(!y);
		x = x && y;
		x = x || y;
		// Bitwise za.co.coach.learning.tij.operators:
		//! x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		// Compound assignment:
		//! x += y;
		//! x -= y;
		//! x *= y;
		//! x /= y;
		//! x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		//! char c = (char)x;
		//! byte b = (byte)x;
		//! short s = (short)x;
		//! int i = (int)x;
		//! long l = (long)x;
		//! float f = (float)x;
		//! double d = (double)x;
	}

	void charTest(char x, char y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		x = (char) (x * y);
		x = (char) (x / y);
		x = (char) (x % y);
		x = (char) (x + y);
		x = (char) (x - y);
		x++;
		x--;
		x = (char) +y;
		x = (char) -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		// Bitwise za.co.coach.learning.tij.operators:
		x = (char) ~y;
		x = (char) (x & y);
		x = (char) (x | y);
		x = (char) (x ^ y);
		x = (char) (x << 1);
		x = (char) (x >> 1);
		x = (char) (x >>> 1);
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		//! boolean bl = (boolean)x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	void byteTest(byte x, byte y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		x = (byte) (x * y);
		x = (byte) (x / y);
		x = (byte) (x % y);
		x = (byte) (x + y);
		x = (byte) (x - y);
		x++;
		x--;
		x = (byte) +y;
		x = (byte) -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		// Bitwise za.co.coach.learning.tij.operators:
		x = (byte) ~y;
		x = (byte) (x & y);
		x = (byte) (x | y);
		x = (byte) (x ^ y);
		x = (byte) (x << 1);
		x = (byte) (x >> 1);
		x = (byte) (x >>> 1);
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		//! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	void shortTest(short x, short y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		x = (short) (x * y);
		x = (short) (x / y);
		x = (short) (x % y);
		x = (short) (x + y);
		x = (short) (x - y);
		x++;
		x--;
		x = (short) +y;
		x = (short) -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		// Bitwise za.co.coach.learning.tij.operators:
		x = (short) ~y;
		x = (short) (x & y);
		x = (short) (x | y);
		x = (short) (x ^ y);
		x = (short) (x << 1);
		x = (short) (x >> 1);
		x = (short) (x >>> 1);
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	void intTest(int x, int y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		// Bitwise za.co.coach.learning.tij.operators:
		x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		x = x << 1;
		x = x >> 1;
		x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}

	void longTest(long x, long y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		// Bitwise za.co.coach.learning.tij.operators:
		x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		x = x << 1;
		x = x >> 1;
		x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x ^= y;
		x |= y;
		// Casting:
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		float f = (float) x;
		double d = (double) x;
	}

	void floatTest(float x, float y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		// Bitwise za.co.coach.learning.tij.operators:
		//! x = ~y;
		//! x = x & y;
		//! x = x | y;
		//! x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		//! x &= y;
		//! x ^= y;
		//! x |= y;
		// Casting:
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		double d = (double) x;
	}

	void doubleTest(double x, double y) {
		// Arithmetic za.co.coach.learning.tij.operators:
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		// Relational and logical:
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!x);
		//! f(x && y);
		//! f(x || y);
		// Bitwise za.co.coach.learning.tij.operators:
		//! x = ~y;
		//! x = x & y;
		//! x = x | y;
		//! x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		// Compound assignment:
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		//! x &= y;
		//! x ^= y;
		//! x |= y;
		// Casting:
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
	}
} ///:~
