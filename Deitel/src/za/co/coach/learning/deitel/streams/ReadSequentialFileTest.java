package za.co.coach.learning.deitel.streams;

public class ReadSequentialFileTest {
	public static void main(String[] args) {
		ReadSequentialFile application = new ReadSequentialFile();

		application.openFile();
		application.readRecords();
		application.closeFile();
	} // end main
}