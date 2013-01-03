package za.co.coach.learning.tij.object;

//: za.co.coach.learning.tij.object/HelloDate.java
import java.util.Date;

/** The first Thinking in Java example program.
 * Displays a string and today's date.
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
*/
public class HelloDate {
	/** Entry point to class & application.
	 * @param args array of string arguments
	 * @throws za.co.coach.learning.tij.exceptions No za.co.coach.learning.tij.exceptions thrown
	*/
	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());
	}
} /* Output: (55% match)
Hello, it's:
Wed Oct 05 14:39:36 MDT 2005
*///:~
