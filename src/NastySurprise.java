
// I don't know what I am doing yet

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;

import javax.swing.JButton;

public class NastySurprise implements Runnable {
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button0 = new JButton();
	static JButton button1 = new JButton();
	
	public static void main (String args[]) {
		SwingUtilities.invokeLater(new NastySurprise());
	}
	
	public void run () {
		setFrame();
	}
	
	public void setFrame () {
		frame.setVisible(true);
		frame.add(panel);
		
		panel.add(button0);
		panel.add(button1);
		
		button0.setText("Trick");
		button0.addActionListener(this);
		
		button1.setText("Treat");
		button1.addActionListener(this);
	}
}