package za.co.coach.learning.tij.gui;

//: za.co.coach.learning.tij.gui/GridLayout1.java
// Demonstrates GridLayout.
import static za.co.coach.util.SwingConsole.run;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout1 extends JFrame {
	public GridLayout1() {
		setLayout(new GridLayout(7, 3));
		for (int i = 0; i < 20; i++)
			add(new JButton("Button " + i));
	}

	public static void main(String[] args) {
		run(new GridLayout1(), 300, 300);
	}
} ///:~
