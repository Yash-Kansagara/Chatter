package GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UserInterface extends JFrame {

	JButton facebook_button, google_button;
	UserInterface ui;
	static Card Google_card = new Card(Card.GOOGLE);
	
	static Card Facebook_card = new Card(Card.FACEBOOK);
	
	public UserInterface() {
		super("Chatter");
		setSize(250, 500);
		ui=this;
		
		Facebook_card.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				facebook_button.setEnabled(true);
			}
		});
		
		Google_card.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				google_button.setEnabled(true);
			}
		});
		
		getContentPane().setLayout(new FlowLayout());
		facebook_button = new JButton("Facebook");
		google_button = new JButton("Google");
		
		facebook_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				facebook_button.setEnabled(false);
				Facebook_card.setVisible(true);
			}
		});
		google_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				google_button.setEnabled(false);
				Google_card.setVisible(true);
			}
		});
		getContentPane().add(facebook_button);
		getContentPane().add(google_button);
		
		System.out.println(getLayout().toString());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
