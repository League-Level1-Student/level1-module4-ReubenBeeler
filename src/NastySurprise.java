
// I don't know what I am doing yet

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.SwingUtilities;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NastySurprise implements Runnable, ActionListener {
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	static JButton trick_button = new JButton();
	static JButton treat_button = new JButton();
	
	static JLabel trick_label= new JLabel();
	static JLabel treat_label= new JLabel();
	
 /* static URL image = getClass().getResource("[filename]");
  * 
  * Icon icon = new ImageIcon(image);
  */
	public static void main (String args[]) {
		SwingUtilities.invokeLater(new NastySurprise());
	}
	
	public void run () {
		setFrame();
	}
	
	public void setFrame () {
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(trick_button);
		panel.add(treat_button);
		panel.add(trick_label);
		panel.add(treat_label);
		
		trick_button.setText("Trick");
		trick_button.addActionListener(this);
		
		treat_button.setText("Treat");
		treat_button.addActionListener(this);
		
		trick_label.setIcon(new ImageIcon(getClass().getResource("cute_puppy.jpg")));
		trick_label.setVisible(false);
		
		treat_label.setIcon(new ImageIcon(getClass().getResource("scary_image.jpg")));
		treat_label.setVisible(false);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == trick_button) {
			treat_label.setVisible(false);
			trick_label.setVisible(true);
		} else if (e.getSource() == treat_button) {
			trick_label.setVisible(false);
			treat_label.setVisible(true);
		}
		frame.pack();
	}
}