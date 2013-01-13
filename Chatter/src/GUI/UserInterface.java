package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class UserInterface extends JFrame {

	JButton facebook_button, google_button;

	public UserInterface() {
		super("Chatter");
		setSize(300, 600);
		
		getContentPane().setLayout(new FlowLayout());
		facebook_button = new JButton("Facebook");
		google_button = new JButton("Google");
		
		facebook_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new GoogleCard(GoogleCard.FACEBOOK);
			}
		});
		google_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new GoogleCard(GoogleCard.GOOGLE);
			}
		});
		getContentPane().add(facebook_button);
		getContentPane().add(google_button);
		
		
		System.out.println(getLayout().toString());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
