package za.co.coach.learning.tij.concurrency;

//: za.co.coach.learning.tij.concurrency/DaemonsDontRunFinally.java
// Daemon threads don't run the finally clause
import static za.co.coach.util.Print.print;

import java.util.concurrent.TimeUnit;

class ADaemon implements Runnable {
	public void run() {
		try {
			print("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			print("Exiting via InterruptedException");
		} finally {
			print("This should always run?");
		}
	}
}

public class DaemonsDontRunFinally {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
	}
} /* Output:
Starting ADaemon
*///:~
