import java.util.*;
import java.util.Scanner;
/**Student: Shahaf Dan
   Lab 06 Exercise 2
 */
public class exercise2
{
    public static void main()
    {
        System.out.println("Please enter three number, and we will dteremine their increasing order");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
        
    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3)
    {
        double g = 0;
        double m = 0;
        double l = 0;
        if(num1 > num2)
        {
            if(num1 > num3)
            {
                g = num1;
                if(num2 > num3)
                {
                    m = num2;
                    l = num3;
                }
                else
                {
                    l = num2;
                    m = num3;
                }
            }
            else
            {
                g = num3;
                m = num1;
                l = num2;
            }
        }
        else
        {
            if(num2 > num3)
            {
                g = num2;
                if(num1 > num3)
                {
                    m = num1;
                    l = num3;
                }
                else
                {
                    m = num3;
                    l = num1;
                }
            }
            else
            {
                g = num3;
                m = num2;
                l = num1;
            }
        }
        
        System.out.println("Greatest Number: " + g + "\nMiddle Number: " + m + "\nLowest number: " + l);
    }
}
