//: za.co.coach.learning.tij.annotations/database/Uniqueness.java
// Sample of nested za.co.coach.learning.tij.annotations
package za.co.coach.learning.tij.annotations.database;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique = true);
} ///:~
