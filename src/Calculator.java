import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	
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
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		frame.setSize(325, 100);
		frame.setTitle("Calculator");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	Float add() {
		
		return Float.valueOf(box1.getText()) + Float.valueOf(box2.getText());
	}
	
	Float subtract() {
		
		return Float.valueOf(box1.getText()) - Float.valueOf(box2.getText());
	}
	
	Float multiply() {
		
		return Float.valueOf(box1.getText()) * Float.valueOf(box2.getText());
	}
	
	Float divide() {
		
		return Float.valueOf(box1.getText()) / Float.valueOf(box2.getText());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == btn1) {
			label.setText(String.valueOf(add()));
		} else if (e.getSource() == btn2) {
			label.setText(String.valueOf(subtract()));
		} else if (e.getSource() == btn3) {
			label.setText(String.valueOf(multiply()));
		} else if (e.getSource() == btn4) {
			label.setText(String.valueOf(divide()));
		} else {
			System.out.println("Error");
		}
		
		if (Float.parseFloat(label.getText()) % 1.0 == 0.0) {
			label.setText(String.valueOf(Integer.parseInt(label.getText().substring(0, label.getText().indexOf(".")))));
		}
		
		frame.setSize(325, 120);
	}
}