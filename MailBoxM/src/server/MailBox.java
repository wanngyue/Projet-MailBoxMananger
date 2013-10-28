package server;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class MailBox implements Serializable{
	private int id;
	public String name;
	public String user;
	public Collection<Message> messages=new ArrayList<Message>();

	public MailBox() {
	
	}
	public MailBox(String user) {
		this.user=user;
		this.name=user+"@YMail.com";
	}
	public MailBox(String user,String mail) {
		this.user=user;
		this.name=mail;
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	@OneToMany(cascade=ALL,mappedBy="mailb")
	public Collection<Message> getMessages() {
		return messages;
	}
	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
	public void addMessage(Message m){
		messages.add(m);
	}
	public void sendMessage(Message m){
		
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Message readNewMessages(){
		return null;
	}
	public void deleteAMessage(){
		
	}
	public void deleteReadMessage(){
		
	}
	public void deleteAllMessages(){
		
	}
}
