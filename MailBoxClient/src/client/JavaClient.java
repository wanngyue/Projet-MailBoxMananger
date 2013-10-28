package client;

import server.MailBoxManagerBean;
import server.MailBoxManagerBeanService;
import ejb.DirectoryManagerBean;
import ejb.DirectoryManagerBeanService;


public class JavaClient {

	public static void main(String[] args) {
		try {
			DirectoryManagerBean dm=new DirectoryManagerBeanService().getDirectoryManagerBeanPort();
			MailBoxManagerBean mb=new MailBoxManagerBeanService().getMailBoxManagerBeanPort();
			System.out.println("--> add an user 'AAA' with the news access\n");
			dm.addUser("AAA", 1);
			System.out.println("--> add an user 'BBB' with the news access\n");
			dm.addUser("BBB", 1);
			System.out.println("--> add an user 'CCC' without the news access\n");
			dm.addUser("CCC", 0);
			System.out.println("--> add an user 'DDD' with the news access\n");
			dm.addUser("DDD", 1);
			System.out.println("--> remove the user 'DDD'\n");
			dm.removeUser("DDD");
			System.out.println("--> list all the users\n");
			System.out.println(dm.listUsers());
			
			System.out.println("--> 'AAA' send 'BBB' an mail\n");
			mb.sendMessage("AAA", "BBB", "HelloB", "whatsup");
			System.out.println("--> 'AAA' send 'CCC' an mail\n");
			mb.sendMessage("AAA", "CCC", "HelloB", "whatsup");
			System.out.println("--> 'AAA' send an mail to newsgroup\n");
			mb.sendNews("AAA", "News1", "Test", 1);
			
			System.out.println("--> 'BBB' read all the mails in the mailbox :");
			System.out.println(mb.readAllMessages("BBB"));
			System.out.println("--> Remove all the mails which are already read\n");
			mb.deleteReadMessages("BBB");
	
			System.out.println("Test done!");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
