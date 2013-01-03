package za.co.coach.learning.tij.gui;

//: za.co.coach.learning.tij.gui/TextPane.java
// The JTextPane za.co.coach.learning.tij.control is a little editor.
import static za.co.coach.util.SwingConsole.run;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import za.co.coach.util.Generator;
import za.co.coach.util.RandomGenerator;

public class TextPane extends JFrame {
	private JButton b = new JButton("Add Text");
	private JTextPane tp = new JTextPane();
	private static Generator sg = new RandomGenerator.String(7);

	public TextPane() {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 10; i++)
					tp.setText(tp.getText() + sg.next() + "\n");
			}
		});
		add(new JScrollPane(tp));
		add(BorderLayout.SOUTH, b);
	}

	public static void main(String[] args) {
		run(new TextPane(), 475, 425);
	}
} ///:~
