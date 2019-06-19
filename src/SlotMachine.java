import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SlotMachine {
	
	public static void main(String args[]) {
		new SlotMachine();
		//createLabelImage("cherry.png");
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
	
}