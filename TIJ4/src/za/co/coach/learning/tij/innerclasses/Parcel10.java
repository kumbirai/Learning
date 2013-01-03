package za.co.coach.learning.tij.innerclasses;

//: za.co.coach.learning.tij.innerclasses/Parcel10.java
// Using "instance za.co.coach.learning.tij.initialization" to perform
// construction on an anonymous inner class.

public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			// Instance za.co.coach.learning.tij.initialization for each object:
			{
				cost = Math.round(price);
				if (cost > 100)
					System.out.println("Over budget!");
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasmania", 101.395F);
	}
} /* Output:
Over budget!
*///:~
