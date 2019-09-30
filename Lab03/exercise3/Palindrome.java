import java.util.Scanner;
/** Student: Shahaf Dan*/
public class Palindrome
{
    public static void main()
    {
        System.out.println("Enter a three digit number and we will determine whether or not it is a palindrome");
        Scanner input = new Scanner(System.in);
        
        String number = input.next();
        while (number.length()!=3)
        {
            System.out.println("This is not a three digit number");
            
            number = input.next();
        }
        
        if(number.charAt(0)==(number.charAt(2)))
        {
         
            System.out.println("The number you entered (" + number + "), is a palindrome");
            
        }
        else
        {
            System.out.println("The number you entered is NOT a plaindrome");
        }
        
    }
}
