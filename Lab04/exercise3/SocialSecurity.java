import java.util.Scanner;

/** Student: Shahaf Dan */
public class SocialSecurity
{
    public static void main()
    {
        System.out.println("Please enter a social security number in the form DDD - DD - DDDD");
        Scanner input = new Scanner(System.in);
        String ssn = input.next();
        boolean valid = false;
        
        while(!valid)
        {
            if(ssn.charAt(3) == '-' && ssn.charAt(6) == '-' && ssn.length() == 11)
            {
                valid = true;
                
            }
            else
            {
                System.out.println("Input is NOT valid, try again, follow the format");
                ssn = input.next();
            }
        }

        System.out.println("Thank you for your cooporation");
        
        
    }
}
