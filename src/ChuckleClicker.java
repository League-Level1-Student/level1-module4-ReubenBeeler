import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton jokeButton = new JButton();
	static JButton punchButton = new JButton();
	
	public static void main(String args[]) {
		new ChuckleClicker().makeButtons();
	}
	
	void makeButtons() {
		frame.setVisible(true);
		
		frame.add(panel);
		panel.add(jokeButton);
		panel.add(punchButton);
		
		jokeButton.setText("Joke");
		punchButton.setText("Punchline");
		
		jokeButton.addActionListener(this);
		punchButton.addActionListener(this);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jokeButton) {
			JOptionPane.showMessageDialog(null, "Why did the child cross the road?");
		} else if (e.getSource() == punchButton) {
			JOptionPane.showMessageDialog(null, "To get to the other slide!");
		}
	}
}