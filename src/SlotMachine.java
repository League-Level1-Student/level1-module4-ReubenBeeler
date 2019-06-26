import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JLabel left = new JLabel();
	JLabel middle = new JLabel();
	JLabel right = new JLabel();
	
	JButton SPIN = new JButton("SPIN!");
	
	JLabel cherry;
	JLabel grapes;
	JLabel watermelon;
	
	Dimension D = new Dimension();
	
	Random bluurb = new Random();
	
	public static void main(String args[]) throws MalformedURLException {
		new SlotMachine().run();
		
	}
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
        	System.err.println("Could not find image " + fileName);
        	return new JLabel();
        }
        Icon icon = new ImageIcon(imageURL);
        JLabel imageLabel = new JLabel(icon);
        return imageLabel;
	}

	void run() {
		
		frame.add(panel);
		
		panel.add(left);
		panel.add(middle);
		panel.add(right);
		
		//left.setMaximumSize();
		
		
		panel.add(SPIN);
		SPIN.addActionListener(this);
		
		frame.setSize(600, 210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	JLabel check(Integer randint) throws MalformedURLException {
		if (randint == 0) {
			return createLabelImage("cherry.png");
		} else if (randint == 1) {
			return createLabelImage("grapes.png");
		} else {
			return createLabelImage("watermelon.png");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int first = bluurb.nextInt(3);
		int second = bluurb.nextInt(3);
		int third = bluurb.nextInt(3);
		panel.remove(left);
		panel.remove(middle);
		panel.remove(right);
		
		try {
			left = check(first);
			middle = check(second);
			right = check(third);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		panel.add(left);
		panel.add(middle);
		panel.add(right);
		
		frame.pack();
		
		if (first == second && second == third) {
			JOptionPane.showMessageDialog(frame, "Success!");
		}
	}
}