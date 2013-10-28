package client;
import javax.naming.InitialContext;
import ejb.DirectoryManager;

public class DirectoryManagerJavaClient {

    public static void main(String args[]) {
        try {
            InitialContext ic = new InitialContext();
            DirectoryManager directoryManager = (DirectoryManager) ic.lookup("ejb.DirectoryManager");
            
            System.out.println(directoryManager.listUsers());
            
            System.out.println("=> Ajout d'un utilisateur simple : toto\n");
            directoryManager.addUser("toto", 0);
            
            System.out.println(directoryManager.listUsers());
            
            System.out.println("=> Ajout d'un utilisateur avec le droit d'envoi sur le newsgroup : titi\n");
            directoryManager.addUser("titi", 1);
            
            System.out.println("=> Ajout d'un utilisateur avec le droit d'envoi sur le newsgroup : tata\n");
            directoryManager.addUser("tata", 1);
            
            System.out.println("=> Ajout d'un utilisateur avec le droit d'envoi sur le newsgroup : tete\n");
            directoryManager.addUser("tete", 1);
            
            System.out.println(directoryManager.listUsers());
            
           /* System.out.println("=> Suppression de l'utilisateur toto\n");
            directoryManager.removeUser("toto");
            
            System.out.println(directoryManager.listUsers());*/
            
//            System.out.println("=> Modification des droits de titi\n");
//            directoryManager.updateUserRights("titi", 0);
//            
//            System.out.println(directoryManager.listUsers());
//            
//            System.out.println("=> Suppression de l'utilisateur titi\n");
//            directoryManager.removeUser("titi");
//            
//            System.out.println(directoryManager.listUsers());

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
