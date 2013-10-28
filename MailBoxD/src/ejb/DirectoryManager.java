package ejb;
import javax.ejb.Remote;

@Remote
public interface DirectoryManager {
	
	public void addUser(String pseudo, int newsGroupRight);
	public void removeUser(String pseudo);
	public void updateUserRights(String pseudo, int newsGroupRight);
	public int lookupUserRights(String pseudo);
	public String listUsers();

}
