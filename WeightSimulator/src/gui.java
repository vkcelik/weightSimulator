import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class gui extends JFrame{
	
	private String onDisplay = "";
	JTextField textField;
	
	public static void main(String[] args) {
		JFrame f = new gui();	
		f.setVisible(true);
	}

	public gui() {
		// define containers
		JPanel keypad = new JPanel();
		JPanel weight = new JPanel();
		JPanel textpanel = new JPanel();
		JPanel buttons = new JPanel();
		JPanel mainpanel = new JPanel();

		// define components
		JSlider slide = new JSlider(SwingConstants.HORIZONTAL, 0, 6, 0);
		JLabel min = new JLabel("0");
		JLabel max = new JLabel("6");

//		JTextArea text = new JTextArea(10,20);
//		text.setEditable(false);
//		text.setText("Indtast nr.");
		
		JTextField msgToUser = new JTextField("Indtast nr.");
		msgToUser.setEditable(false);
		textField = new JTextField();
		textField.setEditable(false);

		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bClear = new JButton("C");
		JButton bOk = new JButton("OK");	
		JButton bTare = new JButton("Tare");
		JButton bQuit = new JButton("Quit");
		JButton bReset = new JButton("Reset");

		// set layoutmanagers
		keypad.setLayout(new GridLayout(4, 3));
		weight.setLayout(new FlowLayout(FlowLayout.LEFT));
		buttons.setLayout(new FlowLayout(FlowLayout.LEFT));
		textpanel.setLayout(new BoxLayout(textpanel, BoxLayout.Y_AXIS));
		mainpanel.setLayout(new BorderLayout());

		// add components
		keypad.add(b1);
		keypad.add(b2);
		keypad.add(b3);
		keypad.add(b4);
		keypad.add(b5);
		keypad.add(b6);
		keypad.add(b7);
		keypad.add(b8);
		keypad.add(b9);
		keypad.add(bClear);
		keypad.add(b0);
		keypad.add(bOk);

		weight.add(min);
		weight.add(slide);
		weight.add(max);

		buttons.add(bQuit);
		buttons.add(bTare);
		buttons.add(bReset);
		
		textpanel.add(msgToUser);
		textpanel.add(textField);

		mainpanel.add(weight, BorderLayout.NORTH);
		mainpanel.add(textpanel, BorderLayout.CENTER);
		mainpanel.add(keypad, BorderLayout.EAST);
		mainpanel.add(buttons, BorderLayout.SOUTH);

		// adding main panel
		setContentPane(mainpanel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();

		bClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("hej");
			}
		});
//		
//		class ClearAction implements ActionListener{
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				text.setText(text.getText(0, text.getText().length()-1));
//			}
//		
//		}

	}
}
