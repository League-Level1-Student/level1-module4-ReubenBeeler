import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField box1 = new JTextField(12);
	JTextField box2 = new JTextField(12);
	JButton btn1 = new JButton("+");
	JButton btn2 = new JButton("-");
	JButton btn3 = new JButton("*");
	JButton btn4 = new JButton("/");
	
	public static void main(String args[]) {
		new Calculator().setFrame();
	}
	
	void setFrame() {
		frame.add(panel);
		panel.add(box1);
		panel.add(box2);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(label);
		
		frame.setSize(325, 100);
		frame.setTitle("Calculator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	Integer add() {
		
		return 0;
	}
	
}