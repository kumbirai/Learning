//: za.co.coach.learning.tij.enumerated/menu/TypeOfFood.java
package za.co.coach.learning.tij.enumerated.menu;

import za.co.coach.learning.tij.enumerated.menu.Food.Appetizer;
import za.co.coach.learning.tij.enumerated.menu.Food.Coffee;
import za.co.coach.learning.tij.enumerated.menu.Food.Dessert;
import za.co.coach.learning.tij.enumerated.menu.Food.MainCourse;

public class TypeOfFood {
	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
		food = MainCourse.LASAGNE;
		food = Dessert.GELATO;
		food = Coffee.CAPPUCCINO;
	}
} ///:~
