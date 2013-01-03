package za.co.coach.learning.tij.io;

//: za.co.coach.learning.tij.io/MemoryInput.java
import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.java"));
		int c;
		while ((c = in.read()) != -1)
			System.out.print((char) c);
	}
} /* (Execute to see output) *///:~
