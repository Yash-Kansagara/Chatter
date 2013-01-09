package Google;

import java.net.ConnectException;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SASLAuthentication;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

import Facebook.MyAuth;

public class Account {
	public Account(String u, String p) {
		USERNAME = u;
		PASSWORD = p;
	}
	private String USERNAME, PASSWORD;
	private ConnectionConfiguration cc;
	private XMPPConnection connection;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	
	public boolean login() throws XMPPException, ConnectException{
		initConnection();
		connection.connect();
		if (!connection.isConnected())
			throw new ConnectException("Can not connect");
		if (USERNAME != null && PASSWORD != null) {
			connection.login(USERNAME, PASSWORD);
			if (connection.isAuthenticated())
				return true;
			else
				return false;
		} else
			return false;
	}
	
	private void initConnection(){
		
		cc = new ConnectionConfiguration("talk.google.com", 5222,
				"gtalk.com");
		
		cc.setRosterLoadedAtLogin(true);
		connection = new XMPPConnection(cc);
		
	}
}
