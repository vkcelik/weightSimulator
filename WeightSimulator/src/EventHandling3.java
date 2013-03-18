import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventHandling3 extends JFrame {
	final String labelPrefix = "Number of button clicks:";
	JButton button;
	JLabel label;
	int numClicks = 0;
	public static void main(String[] args) {
		JFrame f = new EventHandling3();
		f.setVisible(true);
	}
	public EventHandling3() {
		JPanel p = new JPanel();
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		p.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		// define components
		button = new JButton("I'm a swing button!");
		label = new JLabel(labelPrefix + " 0 ");
		p.add(button);
		p.add(label);
		getContentPane().add(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numClicks++;
				label.setText(labelPrefix + numClicks);
			}
		});
	}
}