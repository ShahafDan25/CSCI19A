import java.util.Scanner;

/** Student: Shahaf Dan*/
public class SimpleDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        
        if(number % 5  == 0)
        {
            System.out.println("HiFive");
            
        }
        if(number %2 == 0)
        {
         System.out.println("HiEven");
         
        }
        if(number % 10 == 0)
        {
            System.out.println("hiTen");
        }
    }
}
