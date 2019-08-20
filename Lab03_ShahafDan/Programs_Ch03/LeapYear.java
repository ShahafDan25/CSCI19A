
import java.util.Scanner;
/** Student: Shahaf Dan */
public class LeapYear
{
    public static void main()
    {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        
        //check if the year is a leapo year;
        boolean isLeapYear = (year % 4 ==0 && year % 100 != 0 || year%400 == 0);
        //Display the result
       System.out.println(year + " is a year? " + isLeapYear);
    }
        
}
