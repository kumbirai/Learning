package za.co.coach.learning.tij.enumerated;

//: za.co.coach.learning.tij.enumerated/OverrideConstantSpecific.java
import static za.co.coach.util.Print.print;
import static za.co.coach.util.Print.printnb;

public enum OverrideConstantSpecific {
	NUT, BOLT, WASHER {
		void f() {
			print("Overridden method");
		}
	};
	void f() {
		print("default behavior");
	}

	public static void main(String[] args) {
		for (OverrideConstantSpecific ocs : values()) {
			printnb(ocs + ": ");
			ocs.f();
		}
	}
} /* Output:
NUT: default behavior
BOLT: default behavior
WASHER: Overridden method
*///:~
