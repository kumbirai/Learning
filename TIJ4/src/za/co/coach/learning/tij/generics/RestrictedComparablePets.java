package za.co.coach.learning.tij.generics;

//: za.co.coach.learning.tij.generics/RestrictedComparablePets.java

class Hamster extends ComparablePet implements Comparable<ComparablePet> {
	public int compareTo(ComparablePet arg) {
		return 0;
	}
}

// Or just:

class Gecko extends ComparablePet {
	public int compareTo(ComparablePet arg) {
		return 0;
	}
} ///:~
