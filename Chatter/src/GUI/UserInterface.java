package GUI;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UserInterface extends JFrame {

	JButton facebook_button, google_button;

	public UserInterface() {
		super("Chatter");
		setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		facebook_button = new JButton("Facebook");
		google_button = new JButton("Google"); 
		Icon im = new ImageIcon("Images/facebook_image.png");
		facebook_button.setIcon(im);
		google_button.setIcon(new ImageIcon("Images/google_image.png"));

		add(facebook_button);
		add(google_button);
		setSize(300, 600);
		setVisible(true);
		System.out.println(getLayout().toString());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
