package za.co.coach.learning.tij.containers;

//: za.co.coach.learning.tij.containers/Prediction.java
// Predicting the weather with groundhogs.
import java.util.Random;

public class Prediction {
	private static Random rand = new Random();
	private boolean shadow = rand.nextDouble() > 0.5;

	public String toString() {
		if (shadow)
			return "Six more weeks of Winter!";
		else
			return "Early Spring!";
	}
} ///:~
