package server;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ejb.DirectoryManagerBean;
import ejb.DirectoryManagerBeanService;

@Stateless(name="server/MailBoxManager")
@WebService
public class MailBoxManagerBean implements MailBoxManager{
	@PersistenceContext(unitName="pu5")
	private EntityManager em;
	public MailBoxManagerBean(){
	}
	@WebMethod
	public String readNewMessages(String user) {
		List<Message> list=getNewMessages(user);
		MailBox mb=getMailBox(user);
		String info="";
		if(list!=null){
			for(int i=0;i<list.size();i++){
				Message m=list.get(i);
				if(m.alreadyRead==0){
					info+=m.toString();
					info+="\n";
					em.persist(m);
					m.setAlreadyRead(1);
					//em.persist(mb);
					mb.getMessages().add(m);
				}
			}
		}
		return info;
	}

	@WebMethod
	public String readAllMessages(String user) {
		List<Message> list=getAllMessages(user);
		MailBox mb=getMailBox(user);
		String info="";
		if(list!=null){
			for(int i=0;i<list.size();i++){
				Message m=list.get(i);
				info+=m.toString();
				info+="\n";
				if(m.alreadyRead==0){
					em.persist(m);
					m.setAlreadyRead(1);
					mb.getMessages().add(m);
				}
			}
		}
		return info;
	}

	@WebMethod
	public void deleteMessage(String subject,String user) {
		List<Message> ms=getAllMessages(user, subject);
		//MailBox mb=getMailBox(m.receiverName);
		if(ms!=null){
			for(int i=0;i<ms.size();i++){
				Message m=ms.get(i);
				MailBox mb=getMailBox(m.receiverName);
				em.persist(m);
				mb.getMessages().remove(m);
				em.remove(m);
			}
		}
	}

	@WebMethod
	public void deleteReadMessages(String user) {
		List<Message> list=getAllMessages(user);

		if(list!=null){
			for(int i=0;i<list.size();i++){
				Message m=list.get(i);
				if(m.alreadyRead==1){
					em.persist(m);
					MailBox mb=getMailBox(m.receiverName);
					mb.getMessages().remove(m);
					em.remove(m);
				}
			}
		}
	}

	@WebMethod
	public void sendMessage(String sender, String receiver, String subject,
			String body) {
		String date=getDate();
		Message message=new Message(sender, receiver, date,
				subject, body);
		em.persist(message);
	}

	@WebMethod
	public void sendNews(String sender, String subject,
			String body,int access) {
		DirectoryManagerBean dm=new DirectoryManagerBeanService().getDirectoryManagerBeanPort();
		int right=dm.lookupUserRights(sender);
		List<MailBox> list=getMailBoxs();
		if(right==access){
			String date=getDate();
			Message message;
			for(int i=0;i<list.size();i++){
				MailBox mailbox=list.get(i);
				if(mailbox.getUser()!=sender){
					message=new Message(sender,mailbox.getUser(), date,
							subject, body);
					em.persist(message);
					list.get(i).getMessages().add(message);
				}
				
			}
		}else {
			System.out.println("This user has no access to send this message to groupe!");
		}
	}

	@WebMethod
	public void addUserMailBox(String userName) {
		MailBox mailbox=getMailBox(userName);
		if(mailbox==null){
			//user=new User(userName);
			mailbox=new MailBox(userName);
			em.persist(mailbox);
		}
	}

	@WebMethod
	public void removeUserMailBox(String userName) {
		MailBox mailbox=getMailBox(userName);
		em.remove(mailbox);
	}

	///////////////////////////////////////
	/*
	private User getUser(String userName){
		Query q = em.createQuery("select u from User u where u.name = :name");
		q.setParameter("name", userName);
		try{
			return (User) q.getSingleResult();
		}catch(Exception e){
			return null;
		}
	}
	 */
	private MailBox getMailBox(String user){
		Query q = em.createQuery("select mb from MailBox mb where mb.user = :user");
		q.setParameter("user", user);
		try{
			return (MailBox) q.getSingleResult();
		}catch(Exception e){
			return null;
		}
	}
	private List<MailBox> getMailBoxs(){
		Query q = em.createQuery("select ma from MailBox ma");
		try{
			return (List<MailBox>)q.getResultList();
		}catch(Exception e){
			return null;
		}
	}
	private Message getMessage(String subject){
		Query q = em.createQuery("select me from Message me where me.subject = :subject");
		q.setParameter("subject", subject);
		try{
			return (Message) q.getSingleResult();
		}catch(Exception e){
			return null;
		}
	}
	private List<Message> getAllMessages(String user){
		Query q = em.createQuery("select me from Message me where me.receiverName = :receiverName");
		q.setParameter("receiverName", user);
		try{

			return (List<Message>) q.getResultList();
		}catch(Exception e){
			return null;
		}
	}
	private List<Message> getAllMessages(String user,String subject){
		Query q = em.createQuery("select me from Message me where me.receiverName = :receiverName AND"
				+ " me.subject = :subject");
		q.setParameter("receiverName", user);
		q.setParameter("subject", subject);
		try{

			return (List<Message>) q.getResultList();
		}catch(Exception e){
			return null;
		}
	}
	private List<Message> getNewMessages(String user){
		Query q = em.createQuery("select me from Message me where me.receiverName = :receiverName");
		q.setParameter("receiverName", user);
		try{

			return (List<Message>) q.getResultList();
		}catch(Exception e){
			return null;
		}
	}
	private String getDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
