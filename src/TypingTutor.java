import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	char currentLetter = generateRandomLetter();
	
	Color green = new Color(100, 255, 100);
	Color red = new Color(255, 100, 100);
	
	public static void main(String args[]) {
		new TypingTutor().setup();
	}
	
	void setup() {
		frame.setTitle("Type or Die");
		frame.add(panel);
		panel.add(label);
		
		frame.addKeyListener(this);
		
		label.setText(String.valueOf(currentLetter));
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());
		if (String.valueOf(e.getKeyChar()).equals(String.valueOf(currentLetter))) {
			panel.setBackground(green);
			System.out.println("Correct");
		} else {
			panel.setBackground(red);
			System.out.println("Incorrect");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(String.valueOf(currentLetter));
	}
}