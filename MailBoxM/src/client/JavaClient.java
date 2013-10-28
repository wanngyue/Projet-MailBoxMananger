package client;

import javax.naming.InitialContext;

import server.MailBoxManager;

public class JavaClient {
	public static void main(String args[]) {

		try {

			InitialContext ic = new InitialContext();
			MailBoxManager mailBoxManager = (MailBoxManager) ic.lookup("server.MailBoxManager");            

			//mailBoxManager.addUserMailBox("M1");
			//mailBoxManager.addUserMailBox("M2");
			
			mailBoxManager.sendNews("titi", "HelloNews", "ANews", 1);
			mailBoxManager.sendMessage("toto", "titi", "Hello", "Yes");
			mailBoxManager.sendMessage("toto", "titi", "Hello1", "Yes");
			
			//System.out.println(mailBoxManager.readNewMessages("titi"));
			System.out.println(mailBoxManager.readAllMessages("titi"));
			mailBoxManager.sendMessage("toto", "titi", "Hello2", "Yes");
			
			mailBoxManager.deleteReadMessages("titi");
			/*mailBoxManager.sendMessage("Yue", "WANG", "Hello", "WANG");
			mailBoxManager.sendMessage("Yue", "WANG", "Hello2", "WANG2");
			mailBoxManager.sendMessage("Yue", "WANG", "Hello3", "WANG3");
			System.out.println(mailBoxManager.readNewMessages("WANG"));*/
			
			//mailBoxManager.sendMessage("Yue", "WANG", "Hello4", "WANG4");
			//System.out.println("\n-----------------Read new messages \n");
			//System.out.println(mailBoxManager.readNewMessages("WANG"));
			
			//System.out.println("\n-----------------Read all message \n");
			//System.out.println(mailBoxManager.readAllMessages("WANG"));
			
			
			
			//mailBoxManager.deleteReadMessages("WANG");
			
			
			System.out.println("Hello");
		} catch(Exception e) {
			System.out.println(e);
		}

	}
}
