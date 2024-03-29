package za.co.coach.learning.tij.gui;

//: za.co.coach.learning.tij.gui/Dialogs.java
// Creating and using Dialog Boxes.
import static za.co.coach.util.SwingConsole.run;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyDialog extends JDialog {
	public MyDialog(JFrame parent) {
		super(parent, "My dialog", true);
		setLayout(new FlowLayout());
		add(new JLabel("Here is my dialog"));
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); // Closes the dialog
			}
		});
		add(ok);
		setSize(150, 125);
	}
}

public class Dialogs extends JFrame {
	private JButton b1 = new JButton("Dialog Box");
	private MyDialog dlg = new MyDialog(null);

	public Dialogs() {
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlg.setVisible(true);
			}
		});
		add(b1);
	}

	public static void main(String[] args) {
		run(new Dialogs(), 125, 75);
	}
} ///:~
