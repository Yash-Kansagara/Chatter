package GUI;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UserInterface extends JFrame{

	JButton facebook_button,google_button;
	public UserInterface() {
		super("Chatter");
		
		facebook_button = new JButton();
		google_button = new JButton();
		try {
			facebook_button.setIcon(new ImageIcon(new URL("https://www.google.com/images/srpr/logo3w.png")));
			google_button.setIcon(new ImageIcon(new URL("https://fbstatic-a.akamaihd.net/rsrc.php/v2/yS/x/B1l0pVYCp2E.png")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		add(facebook_button);
		add(google_button);
		setSize(300,600);
		setVisible(true);
	}
	
	
	
	
}
