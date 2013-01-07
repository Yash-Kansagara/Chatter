import java.net.ConnectException;

import org.jivesoftware.smack.XMPPException;

import Facebook.Account;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length == 2){
			Account a = new Account(args[0],args[1]);
		try {
			System.out.println(a.Login());
		} catch (ConnectException | XMPPException e) {
			e.printStackTrace();
		}
		}
		else{
			System.out.println("Usage java Main <username> <password>");
		}
	}

}
