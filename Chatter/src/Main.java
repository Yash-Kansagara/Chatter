import java.io.FileInputStream;
import java.io.InputStream;
import java.net.ConnectException;

import org.jivesoftware.smack.XMPPException;

import Facebook.Account;
import GUI.UserInterface;

public class Main {

	/**
	 * this Main program is still for experimenting library.
	 * 
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		UserInterface u = new UserInterface();
		
		// // if(args.length != 2){
		// final Google.Account a = new
		// Google.Account("<username>","<password>");
		// final Facebook.Account a2 = new
		// Facebook.Account("<username>","<password>");
		// Thread google, facebook;
		// facebook = new Thread() {
		// public void run() {
		// try {
		// System.out.println("Facebook logged in:" + a2.login());
		// } catch (ConnectException | XMPPException e) {
		// System.out.println("Something's wrong !");
		// }
		// }
		//
		// };
		//
		// google = new Thread() {
		// public void run() {
		// try {
		// System.out.println("Google logged in:" + a.login());
		// System.out.println("Loading Roster...");
		// a.loadRoster();
		// a.getFriendList();
		// } catch (ConnectException | XMPPException e) {
		// System.out.println("Something's wrong !");
		// }
		// }
		//
		// };
		// try {
		// google.join();
		// //facebook.join();
		// google.start();
		// //facebook.start();
		// } catch (InterruptedException e) {
		// System.out.println(e.toString());
		// }
		// // }
		// // else{
		// // System.out.println("Usage java Main <username> <password>");
		// // }
		// while(true){
		// Thread.sleep(1000);
		// }

	}

}
