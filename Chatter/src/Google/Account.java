package Google;

import java.net.ConnectException;
import java.util.Collection;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.RosterListener;
import org.jivesoftware.smack.SASLAuthentication;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Presence;

import Facebook.MyAuth;

public class Account {
	
	public Account(String u, String p) {
		USERNAME = u;
		PASSWORD = p;
	}
	private String USERNAME, PASSWORD;
	private ConnectionConfiguration cc;
	private XMPPConnection connection;
	private Roster r;
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
			if (connection.isAuthenticated()){
				r = loadRoster();
				addListener();
				return true;
			}else
				return false;
		} else
			return false;
	}
	
	public void addListener(){
		r.addRosterListener(new RosterListener() {
			
			@Override
			public void presenceChanged(Presence arg0) {
				System.out.println(arg0.getFrom()+":"+arg0);
			}
			
			public void entriesUpdated(Collection<String> arg0) {}
			
			public void entriesDeleted(Collection<String> arg0) {}
			
			public void entriesAdded(Collection<String> arg0){}
		});
	}
	
	public Roster loadRoster() {
		
		return connection.getRoster();
	}
	
	public void getFriendList(){
		Collection<RosterEntry> col = r.getEntries();
		for(RosterEntry re:col){
			System.out.println(re+":"+r.getPresence(re.getUser()).isAvailable());
		}
	}

	private void initConnection(){
		
		cc = new ConnectionConfiguration("talk.google.com", 5222,
				"gtalk.com");
		
		cc.setRosterLoadedAtLogin(true);
		connection = new XMPPConnection(cc);
		
	}
}
