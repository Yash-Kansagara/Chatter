package GUI;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
	JButton login_button,logout_button;
	JPanel ThisCard;
	public Card(int type) {
		
		ThisCard = (JPanel) getContentPane();
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
		
		login_button = new JButton("Login");
		login_button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			card.next(ThisCard);
			}
		});
		login.add(login_button);
		//chats panel
		List l = new List();
		chats.setLayout(new BorderLayout());
		chats.add(l,BorderLayout.CENTER);
		logout_button = new JButton("Logout");
		chats.add(logout_button,BorderLayout.SOUTH);
		logout_button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				card.previous(ThisCard);
			}
		});
		
		//add Panels
		setSize(250,500);
		add(login, "Login_card");
		add(chats,"chat list");
		//Set visible
		//setVisible(true);
		
		
	}

}
