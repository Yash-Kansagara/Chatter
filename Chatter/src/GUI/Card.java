package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Card extends JFrame {

	static final int GOOGLE = 1;
	static final int FACEBOOK = 2;
	final int CardType = 0;
	CardLayout card;
	JPanel login, chats;
	JTextField username;
	JPasswordField password;
	
	
	public Card(int type) {
		// Set the title
		switch(type){
		case GOOGLE:
			super.setTitle("Gtalk");
			break;
		case FACEBOOK:
			super.setTitle("Facebook");
			break;
			
		}
		// Set Layout
		card = new CardLayout();
		getContentPane().setLayout(card);
		
		// Create Panels for Cards
		login = new JPanel();
		chats = new JPanel();
		
		//Login Panel
		login.setLayout(new FlowLayout());
		login.add(new Label("Username",Label.RIGHT));
		username = new JTextField("username",20);
		login.add(username);
		
		login.add(new Label("Password",Label.RIGHT));
		password = new JPasswordField("password",20);
		login.add(password);
		
		//add Panels
		setSize(250,500);
		add(login, "Login_card");
		
		//Set visible
		//setVisible(true);
		
		
	}

}
