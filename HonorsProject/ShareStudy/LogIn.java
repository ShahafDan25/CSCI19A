import java.util.Scanner;
/** Lgin Page*/
public class LogIn
{
   public static void main()
   {
     System.out.println("Welcome to ShareStudy!\n enter 1 to sign in \n enter 2 to create a new accoint");
     Scanner optionInput = new Scanner(System.in);
     int option = optionInput.nextInt();
     boolean validChoice = false;
     boolean signin = false;
     boolean createNew = false;
     while(!validChoice)
     {
         if(option == 1)
         {
             System.out.println("Enter your username and password");
             
             signin = true;
             validChoice = true;
         }
         else if(option == 2)
         {
             System.out.println("Create new User:");
             createNew = true;
             createNewUser();
             validChoice = true;
         }
         else
         {
             System.out.println("Invalid Choice, choose again");
             option = optionInput.nextInt();
             
         }
     }
     
    }
    
    public static void createNewUser()
    {
        Scanner UNInput = new Scanner(System.in);
        System.out.println("Enter you username");
        String UN = UNInput.next();
        
        
        Scanner PWInput = new Scanner(System.in);
        System.out.println("Enter your password");
        String PW = PWInput.next();
        
        Scanner RePWInput = new Scanner(System.in);
        System.out.println("ReEnter you password");
        String RePW = RePWInput.next();
        
        boolean PWmatch = false;
        while(!PWmatch)
        {
               if(RePW.equals(PW))
               {
         
                   System.out.println("Passwords match");
                   PWmatch = true;
           
               }
               else
               {
                   System.out.println("Passwords don't match, recreate you passwords");
               }
        }
        
        //connect to database
        //update database INSERT INTO VALUES()
    }
}
