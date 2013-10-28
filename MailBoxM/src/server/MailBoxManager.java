package server;

import javax.ejb.Remote;

@Remote
public interface MailBoxManager {
	public String readNewMessages(String user);
	public String readAllMessages(String user);
	public void deleteMessage(String subject,String user);
	public void deleteReadMessages(String user);
	public void sendMessage( String sender,String receiver,String subject,String body);
	public void sendNews( String sender,String subject,String body,int access);
	public void addUserMailBox(String user);
	public void removeUserMailBox(String user);
}
