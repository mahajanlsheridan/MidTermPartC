
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String [] args){
        Scanner K=new Scanner(System.in);
        System.out.println("Enter your name");
        String userID=K.nextLine();
            
        System.out.println("choose genre from following- Comedy,Drama,Action,Mystery");
        String genre=K.nextLine();
        
        UserProfile myObj=new UserProfile(userID,genre);
        
        myObj.setUserID(userID);
        
        myObj.setGenre(genre);
        
        System.out.println("User Profile is created");
    }
}
