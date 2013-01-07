package Facebook;

import java.net.ConnectException;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SASLAuthentication;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;

public class Account {

	public Account(String u, String p) {
		USERNAME = u;
		PASSWORD = p;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}
	private String USERNAME, PASSWORD;
	private ConnectionConfiguration cc;
	private XMPPConnection connection;

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	// Login functionality
	public boolean Login() throws XMPPException, ConnectException {
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

	private void initConnection() {
		SASLAuthentication.registerSASLMechanism("DIGEST-MD5",MyAuth.class);
		cc = new ConnectionConfiguration("chat.facebook.com", 5222,
				"chat.facebook.com");
		cc.setSASLAuthenticationEnabled(true);
		cc.setRosterLoadedAtLogin(true);
		connection = new XMPPConnection(cc);
	}
}
