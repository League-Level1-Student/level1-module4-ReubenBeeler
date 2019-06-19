import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class WhackAMole implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b0 = new JButton("       ");
	JButton b1 = new JButton("       ");
	JButton b2 = new JButton("       ");
	JButton b3 = new JButton("       ");
	JButton b4 = new JButton("       ");
	JButton b5 = new JButton("       ");
	JButton b6 = new JButton("       ");
	JButton b7 = new JButton("       ");
	JButton b8 = new JButton("       ");
	JButton b9 = new JButton("       ");
	JButton b10 = new JButton("       ");
	JButton b11 = new JButton("       ");
	Random random = new Random();
	int randint = random.nextInt(12);
	int missed = 0;
	int moles = 0;
	long startTime = System.currentTimeMillis();
	
	public static void main(String args[]) {
		new WhackAMole().setFrame();
	}
	
	void setFrame() {
		frame.setTitle("Whack-a-Mole for Fame and Glory!");
		frame.add(panel);
		
		panel.add(b0);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		
		determineButton(randint);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	void determineButton(int newRandint) {
		if (newRandint == 0) {
			b0.setText("mole!");
		} else if (newRandint == 1) {
			b1.setText("mole!");
		} else if (newRandint == 2) {
			b2.setText("mole!");
		} else if (newRandint == 3) {
			b3.setText("mole!");
		} else if (newRandint == 4) {
			b4.setText("mole!");
		} else if (newRandint == 5) {
			b5.setText("mole!");
		} else if (newRandint == 6) {
			b6.setText("mole!");
		} else if (newRandint == 7) {
			b7.setText("mole!");
		} else if (newRandint == 8) {
			b8.setText("mole!");
		} else if (newRandint == 9) {
			b9.setText("mole!");
		} else if (newRandint == 10) {
			b10.setText("mole!");
		} else if (newRandint == 11) {
			b11.setText("mole!");
		}
	
	}
	
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	private void endGame(int molesWhacked) {
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((System.currentTimeMillis() - startTime) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (((AbstractButton) e.getSource()).getText().equals("mole!")) {
			moles += 1;
			if (moles == 10) {
				endGame(moles);
				frame.dispose();
			}
			((AbstractButton) e.getSource()).setText("       ");
			randint = random.nextInt(12);
			determineButton(randint);
		} else {
			missed += 1;
			speak("You missed the mole!");
			if (missed == 5) {
				speak("Game Over");
				frame.dispose();
			}
			if (randint == 0) {
				b0.setText("       ");
			} else if (randint == 1) {
				b1.setText("       ");
			} else if (randint == 2) {
				b2.setText("       ");
			} else if (randint == 3) {
				b3.setText("       ");
			} else if (randint == 4) {
				b4.setText("       ");
			} else if (randint == 5) {
				b5.setText("       ");
			} else if (randint == 6) {
				b6.setText("       ");
			} else if (randint == 7) {
				b7.setText("       ");
			} else if (randint == 8) {
				b8.setText("       ");
			} else if (randint == 9) {
				b9.setText("       ");
			} else if (randint == 10) {
				b10.setText("       ");
			} else if (randint == 11) {
				b11.setText("       ");
			}
			randint = random.nextInt(12);
			determineButton(randint);
		}
	}	
}