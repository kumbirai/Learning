//: za.co.coach.learning.tij.enumerated/RoShamBo3.java
// Using constant-specific methods.
package za.co.coach.learning.tij.enumerated;

import static za.co.coach.learning.tij.enumerated.Outcome.DRAW;
import static za.co.coach.learning.tij.enumerated.Outcome.LOSE;
import static za.co.coach.learning.tij.enumerated.Outcome.WIN;

public enum RoShamBo3 implements Competitor<RoShamBo3> {
	PAPER {
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
			default: // To placate the compiler
			case PAPER:
				return DRAW;
			case SCISSORS:
				return LOSE;
			case ROCK:
				return WIN;
			}
		}
	},
	SCISSORS {
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
			default:
			case PAPER:
				return WIN;
			case SCISSORS:
				return DRAW;
			case ROCK:
				return LOSE;
			}
		}
	},
	ROCK {
		public Outcome compete(RoShamBo3 it) {
			switch (it) {
			default:
			case PAPER:
				return LOSE;
			case SCISSORS:
				return WIN;
			case ROCK:
				return DRAW;
			}
		}
	};
	public abstract Outcome compete(RoShamBo3 it);

	public static void main(String[] args) {
		RoShamBo.play(RoShamBo3.class, 20);
	}
} /* Same output as RoShamBo2.java *///:~
