package za.co.coach.learning.tij.concurrency;

//: za.co.coach.learning.tij.concurrency/SerialNumberGenerator.java

public class SerialNumberGenerator {
	private static volatile int serialNumber = 0;

	public static int nextSerialNumber() {
		return serialNumber++; // Not thread-safe
	}
} ///:~
