import java.util.Scanner;
/** Student: Shahaf Dan */
public class average
{
    public static void main()
    {
        System.out.println("Enter the amount of values you are going to enter");
        Scanner input = new Scanner(System.in);
        int size =input.nextInt();
        double[] values = new double[size];
        System.out.println("Enter your value");
        double newVal = input.nextInt();
        
        
        for(int i = 0; i < size; i++)
        {
            
            values[i] = newVal;
            System.out.println("Enter your value");
            newVal = input.nextInt();
            
        }
        double total = 0;
        System.out.println("Here are you values: ");
        for(int i = 0; i < size; i++)
        {   
            System.out.print(values[i] + ", " );
            total += values[i];
        }
        
        System.out.println("The average of these values is: " + total/size);
    }
}
