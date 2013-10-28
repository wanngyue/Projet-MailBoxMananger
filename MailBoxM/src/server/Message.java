package server;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MESSAGES_TABLE")
public class Message implements Serializable{
	private int id;
	
	public String senderName;
	public String receiverName;
	public String sendingDate;
	public String subject;
	public String body;
	public int alreadyRead=0;
	
	public MailBox mailb;
	
	//private MailBox mailbox;
	
	
	public Message() {
	}
	
	//contruct a news message
	public Message(String senderName, String sendingDate,
			String subject, String body){
		this.senderName = senderName;
		this.receiverName = "@@";
		this.sendingDate = sendingDate;
		this.subject = subject;
		this.body = body;
		this.alreadyRead = 0;
	}
	public Message(String senderName, String receiverName, String sendingDate,
			String subject, String body) {
		this.senderName = senderName;
		this.receiverName = receiverName;
		this.sendingDate = sendingDate;
		this.subject = subject;
		this.body = body;
		this.alreadyRead = 0;
	}
	
	@Override
	public String toString() {
		return "Message [senderName=" + senderName + ", receiverName="
				+ receiverName + ", sendingDate=" + sendingDate + ", subject="
				+ subject + ", body=" + body + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="MAILBOX_ID")
	public MailBox getMailb() {
		return mailb;
	}

	public void setMailb(MailBox mailb) {
		this.mailb = mailb;
	}
	@Column(name="SENDER")
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	//@Column(name="RECEIVER")
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	@Column(name="DATE")
	public String getSendingDate() {
		return sendingDate;
	}
	public void setSendingDate(String sendingDate) {
		this.sendingDate = sendingDate;
	}
	@Column(name="SUBJECT")
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Column(name="BODY")
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	//@Column(name="READ")
	public int getAlreadyRead() {
		return alreadyRead;
	}
	public void setAlreadyRead(int alreadyRead) {
		this.alreadyRead = alreadyRead;
	}
	/*
	@ManyToOne()
	@JoinColumn(name="MAILBOX_ID")
	public MailBox getMailbox() {
		return mailbox;
	}
	public void setMailbox(MailBox mailbox) {
		this.mailbox = mailbox;
	}
	*/
}
