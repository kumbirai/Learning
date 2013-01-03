//: za.co.coach.learning.tij.enumerated/Competitor.java
// Switching one enum on another.
package za.co.coach.learning.tij.enumerated;

public interface Competitor<T extends Competitor<T>> {
	Outcome compete(T competitor);
} ///:~
