package entity;
import java.io.Serializable;

import javax.persistence.*;

@Entity
public class FinalUser implements Serializable {
	
	private int userId;
	private String pseudo;
	//private int mailBoxId;
	private int newsGroupRight;
	
	public FinalUser() {
		
	}
	public FinalUser(String pseudo, int newsGroupRight){
		this.pseudo = pseudo;
		this.newsGroupRight = newsGroupRight;
	}
	/*
	public FinalUser(String pseudo, int newsGroupRight, int mailBoxId) {
		this.pseudo = pseudo;
		this.newsGroupRight = newsGroupRight;
		this.mailBoxId = mailBoxId;
	}
	*/
	
    @Id
    @GeneratedValue
    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }
    
    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    /*
    public int getMailBoxId() {
        return mailBoxId;
    }

    public void setMailBoxId(int id) {
        this.mailBoxId = id;
    }*/
    
    public int getNewsGroupRight() {
        return newsGroupRight;
    }

    public void setNewsGroupRight(int right) {
        this.newsGroupRight = right;
    }
	
	public String toString() {
		String right;
		if(this.newsGroupRight == 1)
			right = "Yes";
		else
			right = "No";
		return this.userId + "\t" + this.pseudo +  "\tNewsgroup right: " + right;
	}
}
