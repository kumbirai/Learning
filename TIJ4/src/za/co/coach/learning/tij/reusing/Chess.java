package za.co.coach.learning.tij.reusing;

//: za.co.coach.learning.tij.reusing/Chess.java
// Inheritance, constructors and arguments.
import static za.co.coach.util.Print.print;

class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}

public class Chess extends BoardGame {
	Chess() {
		super(11);
		print("Chess constructor");
	}

	public static void main(String[] args) {
		Chess x = new Chess();
	}
} /* Output:
Game constructor
BoardGame constructor
Chess constructor
*///:~
